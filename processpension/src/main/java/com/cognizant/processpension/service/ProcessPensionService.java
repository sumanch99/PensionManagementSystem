/**
 * August 2022
 */
package com.cognizant.processpension.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.processpension.feign.GpdClient;
import com.cognizant.processpension.model.Bank;
import com.cognizant.processpension.model.PensionDetail;
import com.cognizant.processpension.model.Pensioner;
import com.cognizant.processpension.repository.PensionDetailRepository;
import com.cognizant.processpension.repository.PensionerBankRepository;
import com.cognizant.processpension.repository.PensionerRepository;
import com.cognizant.processpension.util.CalculatePensionUtil;
import com.cognizant.processpension.vo.PensionerDetails;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Suman Chakraborty
 *
 */
@Service
@Slf4j
public class ProcessPensionService {

	@Autowired
	GpdClient gdpClient;

	@Autowired
	PensionDetailRepository pensionDetailRepository;

	@Autowired
	PensionerRepository pensionerRepository;
	
	@Autowired
	PensionerBankRepository bankRepository;

	public PensionDetail processPension(String adhaarNo) {
		try {
			PensionerDetails pensionerDetails = gdpClient.getPensionerDetails(adhaarNo);
			Double pensionAmount = CalculatePensionUtil.calculatePension(pensionerDetails.getPensioner().getPensionType(),
					pensionerDetails.getBank().getBankName(), pensionerDetails.getBank().getBankType(),
					pensionerDetails.getPensioner().getSalary(), pensionerDetails.getPensioner().getAllowance());

			PensionDetail pensionDetail = new PensionDetail(adhaarNo, pensionAmount,
					CalculatePensionUtil.getBankServiceChargeFromCSV(pensionerDetails.getBank().getBankName()));
			savePensioner(pensionerDetails.getPensioner());
			savePensionerBank(pensionerDetails.getBank());
			return savePensionDetail(pensionDetail);

		} catch (IOException e) {
			log.error(e.getMessage()); 
			return null;
		}
	}

	private Pensioner savePensioner(Pensioner pensioner) {
		return pensionerRepository.save(pensioner);
	}

	private PensionDetail savePensionDetail(PensionDetail pensionDetail) {
		return pensionDetailRepository.save(pensionDetail);
	}
	
	private Bank savePensionerBank(Bank bank) {
		return bankRepository.save(bank);
	}

}

/**
 * 
 */
package com.cognizant.gpd.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.gpd.exception.GpdException;
import com.cognizant.gpd.model.Pensioner;
import com.cognizant.gpd.util.CommonUtil;
import com.cognizant.gpd.vo.PensionerDetails;

import lombok.extern.slf4j.Slf4j;

/**
 * @author USER
 *
 */

@Service
@Slf4j
public class GeneratePensionerService {

	@Autowired
	CommonUtil util;

	public PensionerDetails getPensionerDetailsByAdhaarNo(String adhaarNo) {
		List<PensionerDetails> pensionerList;
		try {
			pensionerList = util.getDetailsFromCSV();
			for (PensionerDetails pensionerDetails : pensionerList) {
				if (pensionerDetails.getPensioner().getAadharNo().equals(adhaarNo)) {
					return pensionerDetails;
				}
			}
		} catch (IOException e) {
			log.error(e.getMessage());
			throw new GpdException(e);
		}
		return null;
	}

}

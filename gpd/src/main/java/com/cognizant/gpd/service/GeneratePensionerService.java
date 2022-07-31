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

/**
 * @author USER
 *
 */

@Service
public class GeneratePensionerService {

	@Autowired
	CommonUtil util;

	public Pensioner getPensionerDetailsByAdhaarNo(String adhaarNo) {
		List<Pensioner> pensionerList;
		try {
			pensionerList = util.getDetailsFromCSV();
			for (Pensioner pensioner : pensionerList) {
				if (pensioner.getAadharNo().equals(adhaarNo)) {
					return pensioner;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new GpdException(e);
		}
		return null;
	}

}

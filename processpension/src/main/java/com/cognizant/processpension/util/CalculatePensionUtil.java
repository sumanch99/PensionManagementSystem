/**
 * August 2022
 */
package com.cognizant.processpension.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Suman Chakraborty
 *
 */
@Slf4j
public class CalculatePensionUtil {

	public static Double calculatePension(String pensionType, String bankName, String bankType, Double lastSalaryEarned, Double allowances) {

		Double pensionAmount = 0D;
		try {
			if (CommonConstants.SELF_PENSION.equals(pensionType)) {
				pensionAmount = 0.8 * lastSalaryEarned + allowances;
			} else if (CommonConstants.FAMILY_PENSION.equals(pensionType)) {
				pensionAmount = 0.5 * lastSalaryEarned + allowances;
			}
			pensionAmount -= getBankServiceChargeFromCSV(bankName);
		}catch(IOException e) {
			log.error(e.getMessage());
		}
		
		return pensionAmount;
	}
	
	public static Double getBankServiceChargeFromCSV(String bankName) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
        		CalculatePensionUtil.class.getResourceAsStream(CommonConstants.FILE_BANKSERVICECHARGES)));
        String line = null;
        Double serviceCharge = 0D;
        while ((line = br.readLine()) != null)
        {
            String[] s = line.split(",");
            if(s[1].trim().equals(bankName)) {
            	serviceCharge = Double.parseDouble(s[3].trim());
            }
        }
        return serviceCharge;
    }

}

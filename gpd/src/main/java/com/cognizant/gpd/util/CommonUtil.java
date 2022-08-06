/**
 * 
 */
package com.cognizant.gpd.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.gpd.model.Bank;
import com.cognizant.gpd.model.Pensioner;
import com.cognizant.gpd.vo.PensionerDetails;

/**
 * @author USER
 *
 */

@Service
public class CommonUtil {
	
	public List<PensionerDetails> getDetailsFromCSV() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/SAMPLEDATAEXCEL.csv")));
        String line = null;
        List<PensionerDetails> pensionerDetailsList = new ArrayList<>();

        while ((line = br.readLine()) != null)
        {
            String[] s = line.split(",");
            Pensioner pensioner = new Pensioner();
            pensioner.setAadharNo(s[0].trim());
            pensioner.setName(s[1].trim());
            try {
                pensioner.setDob(new SimpleDateFormat("dd-MM-yyyy").parse(s[2].trim()));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            pensioner.setPanNo(s[3].trim());
            pensioner.setSalary(Double.parseDouble(s[4].trim()));
            pensioner.setAllowance(Double.parseDouble(s[5].trim()));
            pensioner.setPensionType(s[6].trim());
            pensioner.setAccountNo(s[8].trim());
            Bank bank = new Bank();
            bank.setBankName(s[7].trim());
            bank.setAccountNo(s[8].trim());
            bank.setBankType(s[9].trim());
            
            PensionerDetails pensionerDetails = new PensionerDetails(pensioner,bank);
            pensionerDetailsList.add(pensionerDetails);
        }
        return pensionerDetailsList;
    }
	
}

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

/**
 * @author USER
 *
 */

@Service
public class CommonUtil {
	
	public List<Pensioner> getDetailsFromCSV() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/SAMPLEDATAEXCEL.csv")));
        String line = null;
        List<Pensioner> pensionerDetailsList = new ArrayList<>();

        while ((line = br.readLine()) != null)
        {
            String[] s = line.split(",");
            Pensioner pd = new Pensioner();
            pd.setAadharNo(s[0].trim());
            pd.setName(s[1].trim());
            try {
                pd.setDob(new SimpleDateFormat("dd-MM-yyyy").parse(s[2].trim()));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            pd.setPanNo(s[3].trim());
            pd.setSalary(s[4].trim());
            pd.setAllowance(s[5].trim());
            pd.setPensionType(s[6].trim());

            pd.setBankDetails(new Bank(s[7].trim(),s[8].trim(),s[9].trim()));
            pensionerDetailsList.add(pd);
        }
        return pensionerDetailsList;
    }
	
}

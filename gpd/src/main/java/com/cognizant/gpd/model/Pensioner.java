/**
 * 
 */
package com.cognizant.gpd.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author USER
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pensioner {
	
	private String aadharNo;
    private String name;
    private Date dob;
    private String panNo;
    private Double salary;
    private Double allowance;
    private String pensionType;
    private String accountNo;
	
}

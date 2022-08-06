/**
 * 
 */
package com.cognizant.processpension.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity
public class Pensioner {
	@Id
	private String aadharNo;
    private String name;
    private Date dob;
    private String panNo;
    private Double salary;
    private Double allowance;
    private String pensionType;
    private String accountNo;
	
}

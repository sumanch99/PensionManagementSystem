/**
 * August 2022
 */
package com.cognizant.pms.processPension.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Suman Chakraborty
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PensionDetail {
	@Id
	private String aadharNo;
	private Double pensionAmount;
	private Double bankServiceCharge;
	
}

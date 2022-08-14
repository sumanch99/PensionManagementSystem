/**
 * 
 */
package com.cognizant.pms.processPension.bo;

import com.cognizant.pms.processPension.model.Bank;
import com.cognizant.pms.processPension.model.Pensioner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author USER
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PensionerDetails {
	Pensioner pensioner;
	Bank bank;
}

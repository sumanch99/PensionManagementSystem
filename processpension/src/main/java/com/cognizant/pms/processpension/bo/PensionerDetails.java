/**
 * 
 */
package com.cognizant.pms.processpension.bo;

import com.cognizant.pms.processpension.model.Bank;
import com.cognizant.pms.processpension.model.Pensioner;

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

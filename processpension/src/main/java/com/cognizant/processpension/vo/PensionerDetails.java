/**
 * 
 */
package com.cognizant.processpension.vo;

import com.cognizant.processpension.model.Bank;
import com.cognizant.processpension.model.Pensioner;

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

/**
 * 
 */
package com.cognizant.gpd.vo;

import com.cognizant.gpd.model.Bank;
import com.cognizant.gpd.model.Pensioner;

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

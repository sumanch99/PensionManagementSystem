/**
 * 
 */
package com.cognizant.gpd.model;

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
public class Bank {
	
	private String bankName;
    private String accountNo;
    private String bankType;
}

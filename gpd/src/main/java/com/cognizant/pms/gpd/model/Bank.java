/**
 * 
 */
package com.cognizant.pms.gpd.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author USER
 *
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
	
	private String bankName;
    private String accountNo;
    private String bankType;
}

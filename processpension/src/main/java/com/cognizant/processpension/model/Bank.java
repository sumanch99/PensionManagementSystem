/**
 * 
 */
package com.cognizant.processpension.model;

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
public class Bank {
	private String bankName;
	@Id
    private String accountNo;
    private String bankType;
}

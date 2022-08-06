/**
 * August 2022
 */
package com.cognizant.processpension.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.processpension.model.Bank;

/**
 * @author Suman Chakraborty
 *
 */
public interface PensionerBankRepository extends JpaRepository<Bank, String> {

}

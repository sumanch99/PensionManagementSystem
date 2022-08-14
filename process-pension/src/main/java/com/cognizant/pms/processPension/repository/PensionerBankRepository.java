/**
 * August 2022
 */
package com.cognizant.pms.processPension.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.pms.processPension.model.Bank;

/**
 * @author Suman Chakraborty
 *
 */
@Repository
public interface PensionerBankRepository extends JpaRepository<Bank, String> {

}

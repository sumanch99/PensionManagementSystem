/**
 * August 2022
 */
package com.cognizant.pms.processPension.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.pms.processPension.model.Pensioner;

/**
 * @author Suman Chakraborty
 *
 */
@Repository
public interface PensionerRepository extends JpaRepository<Pensioner, String>{

}

/**
 * August 2022
 */
package com.cognizant.processpension.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.processpension.model.PensionDetail;

/**
 * @author Suman Chakraborty
 *
 */
@Repository
public interface PensionDetailRepository extends JpaRepository<PensionDetail, String> {

}
 
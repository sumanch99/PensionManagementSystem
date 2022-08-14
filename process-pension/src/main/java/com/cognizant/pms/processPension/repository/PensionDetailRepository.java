/**
 * August 2022
 */
package com.cognizant.pms.processPension.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.pms.processPension.model.PensionDetail;


/**
 * @author Suman Chakraborty
 *
 */
@Repository
public interface PensionDetailRepository extends JpaRepository<PensionDetail, String> {
	Optional<PensionDetail> findByAadharNo(String aadharNo);
}
 
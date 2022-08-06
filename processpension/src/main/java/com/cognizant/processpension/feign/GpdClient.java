/**
 * August 2022
 */
package com.cognizant.processpension.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.processpension.vo.PensionerDetails;

/**
 * @author Suman Chakraborty
 *
 */
@FeignClient("APIGateway")
public interface GpdClient {

	@GetMapping("/PensionerDetailByAadhaar/{adhaarNo}")
	public PensionerDetails getPensionerDetails(@PathVariable String adhaarNo);
	
}

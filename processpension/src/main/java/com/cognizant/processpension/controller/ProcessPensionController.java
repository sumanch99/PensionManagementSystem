/**
 * 
 */
package com.cognizant.processpension.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.processpension.model.PensionDetail;
import com.cognizant.processpension.service.ProcessPensionService;
import com.cognizant.processpension.vo.ProcessPensionInput;

/**
 * @author USER
 *
 */
@RestController
public class ProcessPensionController {
	
	@Autowired
	ProcessPensionService service;
	
	@PostMapping("/ProcessPension") 
	public PensionDetail processPension(@RequestBody ProcessPensionInput input) {
		return service.processPension(input.getAdhaarNo());
	}

}

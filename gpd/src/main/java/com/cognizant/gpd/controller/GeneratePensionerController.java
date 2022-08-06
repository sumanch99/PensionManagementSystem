package com.cognizant.gpd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.gpd.model.Pensioner;
import com.cognizant.gpd.service.GeneratePensionerService;
import com.cognizant.gpd.vo.PensionerDetails;

@RestController
@RequestMapping("/PensionerDetailByAadhaar")
public class GeneratePensionerController {
	
	@Autowired
	GeneratePensionerService service;
	
	@GetMapping("/{adhaarNo}")
	public PensionerDetails getPensionerDetails(@PathVariable String adhaarNo) {
		return service.getPensionerDetailsByAdhaarNo(adhaarNo);
	}
	
}

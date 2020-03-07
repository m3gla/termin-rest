package com.project.terminrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.terminrest.bean.BusinessSubject;
import com.project.terminrest.service.BusinessSubjectService;

@RestController
@RequestMapping("/businessSubject")
public class BusinessSubjectController {
	
	@Autowired
	private BusinessSubjectService businessSubjectService;
	
	@PostMapping
	BusinessSubject createBusinessSubject(@RequestBody BusinessSubject businessSubject) {
		
		businessSubjectService.createBusinessSubject(businessSubject);
		
		return businessSubject;
	}

}

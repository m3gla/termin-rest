package com.project.terminrest.service;

import java.util.List;

import com.project.terminrest.bean.BusinessSubject;

public interface BusinessSubjectService {
	
	Long createBusinessSubject(BusinessSubject pBusinessSubject);
	List<BusinessSubject> getAllBusinessSubjects();

}

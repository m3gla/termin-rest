package com.project.terminrest.dao;

import java.util.List;

import com.project.terminrest.bean.BusinessSubject;

public interface BusinessSubjectDao {
	Long createBusinessSubject(BusinessSubject pBusinessSubject);
	List<BusinessSubject> getAllBusinessSubjects();
}

package com.project.terminrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.terminrest.bean.BusinessSubject;
import com.project.terminrest.dao.BusinessSubjectDao;
import com.project.terminrest.service.BusinessSubjectService;

@Service
public class BusinessSubjectServiceImpl implements BusinessSubjectService{

	@Autowired
	private BusinessSubjectDao businessSubjectDao;
	
	@Override
	public Long createBusinessSubject(BusinessSubject pBusinessSubject) {

		Long idBS = businessSubjectDao.createBusinessSubject(pBusinessSubject);
		pBusinessSubject.setIdBs(idBS);
		return idBS;
	}

}

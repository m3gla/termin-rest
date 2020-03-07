package com.project.terminrest.dao.impl;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.project.terminrest.bean.BusinessSubject;
import com.project.terminrest.dao.BusinessSubjectDao;

@Repository
public class BusinessSubjectDaoImpl implements BusinessSubjectDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Long createBusinessSubject(BusinessSubject pBusinessSubject) {

		String sql = "insert into business_subject (name, identificator, iso_country, tstamp) values (?, ?, ?, current_timestamp)";
	      KeyHolder keyHolder = new GeneratedKeyHolder();

	      jdbcTemplate.update(
	              connection -> {
	                  PreparedStatement ps = connection.prepareStatement(sql, new String[]{"id_bs"});
	                  ps.setString(1, pBusinessSubject.getName());
	                  ps.setString(2, pBusinessSubject.getIdentificator());
	                  ps.setString(3, pBusinessSubject.getIsoCountry());
	                  return ps;
	              }, keyHolder);

		return keyHolder.getKey().longValue();
	}

	@Override
	public List<BusinessSubject> getAllBusinessSubjects() {
		
		String sql = "select id_bs, name, identificator, iso_country, tstamp from business_subject";
		List<BusinessSubject> businessSubjects = jdbcTemplate.query(sql, new BeanPropertyRowMapper<BusinessSubject>(BusinessSubject.class));
		return businessSubjects;
	}

}

package com.project.terminrest.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertTest() {
		String query = "INSERT INTO test_table (id_test, poruka) VALUES (1, 'Pozdrav')";
		jdbcTemplate.update(query);
		
	}
	
	public String getPorukaIzBaze() {
		
		String query = "SELECT poruka FROM test_table WHERE id_test = 2";
		
		String poruka = jdbcTemplate.queryForObject(query, String.class);
		
		return poruka;
	}

}

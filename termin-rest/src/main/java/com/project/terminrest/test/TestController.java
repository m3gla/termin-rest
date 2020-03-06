package com.project.terminrest.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private TestDao testDao;

	@GetMapping("/testRest")
	public String testTreminRest() {
		//testDao.insertTest();
		String poruka = testDao.getPorukaIzBaze();
		return poruka;
	}
}

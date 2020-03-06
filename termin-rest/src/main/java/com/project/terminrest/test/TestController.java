package com.project.terminrest.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/testRest")
	public String testTreminRest() {
		return "Pozdav Golubić. Si pobedil na beli?";
		}
}

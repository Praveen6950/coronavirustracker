package com.sample.springboot.rest.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sample.springboot.rest.example.covid.CovidService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestServiceApplicationTests {

	@Autowired
	CovidService covidService;
	@Test
	public void happyPath() {
		assertNotNull("Welcome");
	}

	@Test
	public void positiveCase() {
		assertNotNull(covidService.getStateDetails("ct"));
	}

}

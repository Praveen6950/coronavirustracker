package com.sample.springboot.rest.example.covid;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidService {

	public CovidTracker getStateDetails(String state) {
		final String uri = "https://covidtracking.com/api/v1/states/" + state + "/current.json";
		CovidTracker result = null;
		try {
			RestTemplate restTemplate = new RestTemplate();
			result = restTemplate.getForObject(uri, CovidTracker.class);
			System.out.print("Deaths="+result.getDeath());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}

package com.sample.springboot.rest.example.covid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",allowedHeaders="*")
@RestController
public class CovidController {

	@Autowired
	CovidService covidService;

	@GetMapping("/welcome")
	public String happyPath() {
		return "Welcome";
	}

	@GetMapping(value="/state/{statecode}")
	public ResponseEntity stateDetails(@PathVariable("statecode") String statecode) {
		System.out.print("statecode="+statecode);

		CovidTracker ct = covidService.getStateDetails(statecode);
		if (ct != null)
			return new ResponseEntity<CovidTracker>(ct, HttpStatus.ACCEPTED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);

	}
}

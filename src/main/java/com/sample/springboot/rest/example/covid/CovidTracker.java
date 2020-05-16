package com.sample.springboot.rest.example.covid;

public class CovidTracker {
	String totalTestResults;
	String positive;
	String death;
	String negative;

	public String getTotalTestResults() {
		return totalTestResults;
	}

	public String getPositive() {
		return positive;
	}

	public String getDeath() {
		return death;
	}

	public void setDeath(String death) {
		this.death = death;
	}

	public void setPositive(String positive) {
		this.positive = positive;
	}

	public void setTotalTestResults(String totalTestResults) {
		this.totalTestResults = totalTestResults;
	}

	public String getNegative() {
		return negative;
	}

	public void setNegative(String negative) {
		this.negative = negative;
	}
}

package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	SomeService someService;
	

	@Override
	public String getDailyWorkout() {
		return someService.someStr();
	}
	
	public void setSomeService(SomeService someService) {
		this.someService = someService;
	}
	


}











package com.flightbooking;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlightTicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightTicketBookingApplication.class, args);
		System.out.println("hello");
	}
	
	 @Bean
	    public ModelMapper getModelMapper() { 
	        return new ModelMapper(); 
	    } 

}

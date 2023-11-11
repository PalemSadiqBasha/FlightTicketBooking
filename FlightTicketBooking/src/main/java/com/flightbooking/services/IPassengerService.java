package com.flightbooking.services;


import java.util.List;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.data.domain.Page;

import com.flightbooking.dto.PassengerDTO;

public interface IPassengerService {
	public PassengerDTO addPassenger(Integer userId, PassengerDTO passenger);

	public List<PassengerDTO> viewAllPassenger();

	public PassengerDTO viewPassengerByUIN(Long uin);
   
	public Page<PassengerDTO> viewAllPassengerPaginated(Pageable pageable); 
}

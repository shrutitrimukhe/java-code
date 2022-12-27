package com.system.util;

import org.springframework.beans.BeanUtils;

import com.system.entity.Hotel;
import com.system.model.HotelDTO;

public class HotelConvertor {
	
	//Method for converting Dto to Entity
			public Hotel convertHotelDTOToHotelEntity(HotelDTO hotelDto) {
				
			Hotel hotel =new Hotel(); //creation of object
				if(hotel!=null) {
					BeanUtils.copyProperties(hotelDto ,hotel); //copy properties of teams
				}
				return hotel;
			}
			
			//Method for converting Entity to Dto
			public HotelDTO convertHotelEntityToHotelDTO(Hotel hotel) {
				HotelDTO hotelDto = new HotelDTO(); //creation of object
				if(hotelDto!=null) {
					BeanUtils.copyProperties(hotel, hotelDto); //copy properties of TeamsDto
				}
				return hotelDto;
			}
}
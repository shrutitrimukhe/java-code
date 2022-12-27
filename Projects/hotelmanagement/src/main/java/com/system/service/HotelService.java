package com.system.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.system.entity.Dish;
import com.system.entity.Hotel;
import com.system.model.DishDTO;
import com.system.model.HotelDTO;

public interface HotelService {
	
	//Abstract method

	String createHotel(Hotel hotel);
	HotelDTO updateHotel(int hotel_id,Hotel hotel);
	HotelDTO getHotelById(int hotel_id);
	List<HotelDTO> getAllHotels();
	String deleteHotelById(int hotel_id);
	void deleteAllHotels();
	
	HotelDTO assignDishToHotel(int hotel_id,int dishid);
	
	List<HotelDTO> getHotelByHotelName(String hotelname);
	List<HotelDTO> getHotelByEmail(String email);
	List<HotelDTO> getHotelByPhone(long phone);
	List<HotelDTO> getHotelByDish(int dish_id);
	
	
	
	
}

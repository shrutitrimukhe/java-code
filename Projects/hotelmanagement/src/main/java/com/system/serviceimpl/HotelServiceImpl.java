package com.system.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.entity.Dish;
import com.system.entity.Hotel;
import com.system.exception.DishNotFoundException;
import com.system.exception.HotelNotFoundException;
import com.system.model.HotelDTO;
import com.system.repository.DishRepository;
import com.system.repository.HotelRepository;
import com.system.service.HotelService;
import com.system.util.HotelConvertor;


@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;     // Instance of hotel repository
	
	@Autowired
	private HotelConvertor hotelconvertor;  
	@Autowired
	private DishRepository dishRepository;   
	       

	@Override
	public String createHotel(Hotel hotel) {   //method creating new hotel
		String message=null;
		hotelRepository.save(hotel);      //Saving hotel to database.
		if(hotel!=null)
		{
			message="Hotel details saved sucessfully";
		}
		return message;
	}   //End the method

	@Override
	public HotelDTO updateHotel(int id, Hotel hotel) {
		// TODO Auto-generated method stub
			Hotel getHotel = hotelRepository.findById(id).get();
				getHotel.setHotelname(hotel.getHotelname());
				getHotel.setPhone(hotel.getPhone());
				getHotel.setEmail(hotel.getEmail());
				
				
				hotelRepository.save(getHotel);
				return hotelconvertor.convertHotelEntityToHotelDTO(getHotel);
			}    

	@Override
	public HotelDTO getHotelById(int id) {    //Method for getting hotel detail by id
		
		Hotel hotel = hotelRepository.findById(id).get();		
		return hotelconvertor.convertHotelEntityToHotelDTO(hotel);
	}
	@Override
	public List<HotelDTO> getAllHotels() {
		List<Hotel> hotel = hotelRepository.findAll();
		List<HotelDTO> hotelDto = new ArrayList<>();
		for(Hotel a: hotel) {
			hotelDto.add(hotelconvertor.convertHotelEntityToHotelDTO(a));
		}
		return hotelDto;
	}

	@Override
	public String deleteHotelById(int id) {
		String message=null;
		Optional<Hotel> hotel=hotelRepository.findById(id);
		if(hotel.isPresent()) {		
			hotelRepository.deleteById(id);
			message = "hotel Deleted Successfully.....";
		}
		else {
			message = "Hotel Details are not found... ==> "+id+"\n ----Enter Correct Hotel Id !";
		}
		return message;
	}

	@Override
	public void deleteAllHotels() {
		// TODO Auto-generated method stub
		hotelRepository.deleteAll();
	}

	@Override
	public HotelDTO assignDishToHotel(int id, int dishid) {
		Hotel hotel = hotelRepository.findById(id).orElseThrow(()-> new HotelNotFoundException("Hotel","ID",id));
		Dish dish = dishRepository.findById(dishid).orElseThrow(()-> new DishNotFoundException("Dish","ID",id));
		hotel.setDish(dish);
	hotelRepository.save(hotel);
		return hotelconvertor.convertHotelEntityToHotelDTO(hotel);
	}
	@Override 
	public List<HotelDTO> getHotelByHotelName(String hotelname) {
		List<Hotel> hotel = hotelRepository.getHotelByHotelName(hotelname);
		List<HotelDTO> hotelDto = new ArrayList<>();
		for(Hotel a: hotel) {
		hotelDto.add(hotelconvertor.convertHotelEntityToHotelDTO(a));
		}
		return hotelDto;
	}

	@Override
	public List<HotelDTO> getHotelByEmail(String email) {
		List<Hotel> hotel = hotelRepository.getHotelByEmail(email);
		List<HotelDTO> hotelDto = new ArrayList<>();
		for(Hotel a: hotel) {
		hotelDto.add(hotelconvertor.convertHotelEntityToHotelDTO(a));
		}
		return hotelDto;
	}

	@Override
	public List<HotelDTO> getHotelByPhone(long phone) {
		List<Hotel> hotel = hotelRepository.getHotelByPhone(phone);
		List<HotelDTO> hotelDto = new ArrayList<>();
		for(Hotel a: hotel) {
		hotelDto.add(hotelconvertor.convertHotelEntityToHotelDTO(a));
		}
		return hotelDto;
	}

	@Override
	public List<HotelDTO> getHotelByDish(int dish_id) {
		List<Hotel> hotel = hotelRepository.getHotelByPhone(dish_id);
		List<HotelDTO> hotelDto = new ArrayList<>();
		for(Hotel a: hotel) {
		hotelDto.add(hotelconvertor.convertHotelEntityToHotelDTO(a));
		}
		return hotelDto;
	}
	
}

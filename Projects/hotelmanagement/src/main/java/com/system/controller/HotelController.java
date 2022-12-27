package com.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.system.entity.Hotel;
import com.system.model.HotelDTO;
import com.system.service.HotelService;
import com.system.util.HotelConvertor;

@RestController
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	@Autowired
	private HotelConvertor hotelconvertor;
	
	@PostMapping("/createHotel")
	public String createHotel(@RequestBody HotelDTO hotelDto) {
		final Hotel hotel = hotelconvertor.convertHotelDTOToHotelEntity(hotelDto);
		return hotelService.createHotel(hotel);
	}
	
	@PutMapping("/updateHotel/{id}")
	public HotelDTO updateHotel(@PathVariable("id") int id ,@RequestBody HotelDTO hotelDto) {
		Hotel hotel = hotelconvertor.convertHotelDTOToHotelEntity(hotelDto);
		return hotelService.updateHotel(id, hotel);
		
	}
	
	@GetMapping("/getHotel/{id}")
	public HotelDTO getHotel(@PathVariable("id") int id) {
		return hotelService.getHotelById(id);
	}
	
	@GetMapping("/getAllHotel")
	public List<HotelDTO> getAllHotel(){
		return hotelService.getAllHotels();
	}
	
	@DeleteMapping("/deleteHotel/{id}")
	public String deleteHotel(@PathVariable("id") int id) {
		return hotelService.deleteHotelById(id);
	}
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll(){
		hotelService.deleteAllHotels();
		return new ResponseEntity<String>("All Details Are Deleted" , HttpStatus.OK);
	}
	@PostMapping("/assign/{id}/{dish_id}")
	public ResponseEntity<String> assignCoachToTeamId(@PathVariable("id") int id,@PathVariable("coachId") int dish_id) {
		hotelService.assignDishToHotel(id, dish_id);
		return new ResponseEntity<String>("Coach is created having id :"+dish_id+" is "+dish_id ,HttpStatus.OK);
	}
	
	
	@GetMapping("/getByName/{hotelname}")
	public List<HotelDTO> getHotelByName(@PathVariable("hotelname") String hotelName){
		return hotelService.getHotelByHotelName(hotelName);
	}

	@GetMapping("/getByPhone/{phone}")
	public List<HotelDTO> getHotelByPhone(@PathVariable("phone") long phone) {
		return hotelService.getHotelByPhone(phone);
	}
	
	@GetMapping("/getByEmail/{email}")
	public List<HotelDTO> getHotelbyEmail(@PathVariable("email") String Email){
		return hotelService.getHotelByEmail(Email);
	}
	@GetMapping("/getByDish/{id}")
	public List<HotelDTO> getHotelByDish(@PathVariable("id") int dish_id){
		return hotelService.getHotelByDish(dish_id);
	}

}



package com.system.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.system.entity.Dish;
import com.system.exception.DishNotFoundException;
import com.system.model.DishDTO;
import com.system.repository.DishRepository;
import com.system.service.DishService;
import com.system.util.DishConvertor;

public class DishServiceImpl implements DishService{
	
	@Autowired
	DishRepository dishRepository;
	
	@Autowired
	DishConvertor dishConverter;
	
	
	
	@Override
	public String createDish(Dish dish) {        //Method for order dish.
		String message=null;
		dishRepository.save(dish);              //Saving hotel to database.
		if(dish!=null)
		{
			message="New dish saved successfully!!";
		}
		else
		{
			message="dish was not saved!!";
		}
		return message;
	}     //End of the method.

	@Override
	public DishDTO updateDish(int id, Dish dish) {     // Method for updating.
		Dish getDish = dishRepository.findById(id).orElseThrow(()-> new DishNotFoundException("Dish","ID",id));
		getDish.setDishname(dish.getDishname());
		getDish.setPrice(dish.getPrice());
		dishRepository.save(getDish);
		return dishConverter.convertdishEntityToDishDto(getDish);
	}

	@Override
	public DishDTO getDish(int id) {                 //Method for getting dish by id.
		Dish dish = dishRepository.findById(id).orElseThrow(()-> new DishNotFoundException("Dish","ID",id));	
		return dishConverter.convertdishEntityToDishDto(dish);
	}

	@Override
	public List<DishDTO> getAllDish() {                  //Method for getting all id.
		List<Dish>dishList =dishRepository.findAll();
		List<DishDTO> dishDto = new ArrayList<>();
		for(Dish b: dishList) {
			dishDto.add(dishConverter.convertdishEntityToDishDto(b));
		}
			return dishDto;
	}
	
	

	@Override
	public String deleteDish(int id) {           //Method for deleting dish by id
		String message=null;
		Optional<Dish> dish=dishRepository.findById(id);
		if(dish.isPresent()) {		
			dishRepository.deleteById(id);
			message = "..........Dish order Delteted  Successfully.........";
		}
		else {
			message = ".........Details are not found........  ==> "+id+"\n ----Enter dish Name !";
		}
		return message;
	}

	@Override
	public void deleteAllDish() {               //Method for deleting all dish
		dishRepository.deleteAll();	
		
	}
	
	@Override
	public List<DishDTO> getDishByName(String dishName) {              
		List<Dish> dish = dishRepository.getDishByName(dishName);
		List<DishDTO> dishDto = new ArrayList<>();
		for(Dish a: dish) {
			dishDto.add(dishConverter.convertdishEntityToDishDto(a));
		}
		return dishDto;
	}
	@Override
	public List<DishDTO> getDishByPrice(long dishPrice) {
		List<Dish> dish = dishRepository.getDishByPrice(dishPrice);
		List<DishDTO> dishDto = new ArrayList<>();
		for(Dish a: dish) {
			dishDto.add(dishConverter.convertdishEntityToDishDto(a));
		}
		return dishDto;

	}

	
	
}

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

import com.system.entity.Dish;
import com.system.model.DishDTO;
import com.system.service.DishService;
import com.system.util.DishConvertor;

@RestController

public class DishController {
	
	@Autowired
	private DishService dishService;
	@Autowired
	private DishConvertor dishConverter;
	
	@PostMapping("/create")
	public String createDish(@RequestBody DishDTO dishDTO) {
		final Dish dish = dishConverter.convertDishDTOToDishEntity(dishDTO);
		return dishService.createDish(dish);
	}
	
	@PutMapping("/update/{id}")
	public DishDTO updatedish(@PathVariable("id") int id,@RequestBody DishDTO dishDto) {
		 Dish dish = dishConverter.convertDishDTOToDishEntity(dishDto);
		return dishService.updateDish(id, dish);
	}
	
	@GetMapping("/get/{id}")
	public DishDTO getDish(@PathVariable("id") int id) {
		return dishService.getDish(id);
	}
	
	@GetMapping("/getAll")
	public List<DishDTO> getAllDish(){
		return dishService.getAllDish();
	}
	
	@DeleteMapping("/del/{id}")
	public String deleteDishById(@PathVariable("id") int id) {
		return dishService.deleteDish(id);
	}
	
	@DeleteMapping("/delAll")
	public ResponseEntity<String> deleteAllDish(){
		dishService.deleteAllDish();
		return new ResponseEntity<String>("All Dish Details Are Deleted",HttpStatus.OK);
	}
	
	
	@GetMapping("/getByName/{name}")
	public List<DishDTO> getDishByName(@PathVariable("dishname") String dishname){
		return dishService.getDishByName(dishname);
	}
	@GetMapping("/getByPrice/{price}")
	public List<DishDTO> getDishByPrice(@PathVariable("price") long price){
		return dishService.getDishByPrice(price);
	}
		

}

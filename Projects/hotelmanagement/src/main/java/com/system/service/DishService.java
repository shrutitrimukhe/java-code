package com.system.service;

import java.util.List;

import com.system.entity.Dish;
import com.system.model.DishDTO;

public interface DishService {
	
	//Abstract method
	
	String createDish(Dish dish);
	DishDTO updateDish(int id,Dish dish);
	DishDTO getDish(int id);	
	List<DishDTO> getAllDish();
	String deleteDish(int id);
	void deleteAllDish();
	
	List<DishDTO> getDishByName(String dishName);
	List<DishDTO> getDishByPrice(long Price);
	
}

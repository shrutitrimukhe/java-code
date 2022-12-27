package com.system.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.system.entity.Dish;
import com.system.entity.Hotel;
import com.system.model.DishDTO;
import com.system.model.HotelDTO;

@Component
public class DishConvertor {
	
	   //Method to converting DTO to entity
		public Dish convertDishDTOToDishEntity(DishDTO dishDTO)
		{
			Dish dish = new Dish();     //Creating an Object
			if(dishDTO!=null)
			{
				BeanUtils.copyProperties(dishDTO, dish);  //Copy properties to dish.
			}
			return dish;
		}
		
		//Method to converting entity to DTO
		public DishDTO convertdishEntityToDishDto(Dish dish)
		{
			DishDTO dishDTO = new DishDTO();      //Creating an Object.
			if(dish!=null)
			{
				BeanUtils.copyProperties(dish, dishDTO);            //Copy properties to dishDto.
			}
			return dishDTO;
		}

		
		

}

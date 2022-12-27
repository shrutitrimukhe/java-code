package com.system.servicelmpl;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.system.entity.Dish;
import com.system.entity.Dish.DishBuilder;
import com.system.repository.DishRepository;
import com.system.service.DishService;

public class DishServiceImpl {

	@Autowired
	private DishService dishService;
	@MockBean
	private DishRepository dishRepository;

	@DisplayName(value = "Order dish Possitve Test")
	@Test
	void createDishTest() {
		Dish dish = new Dish();
		dish.setDishname("Biryani");
		dish.setPrice(350);
	
		Mockito.when(dishRepository.save(dish)).thenReturn(dish);
		assertThat(dishService.createDish(dish)).isEqualTo("New Dish is Order ..");
	}
	
	@Test
	void getDish() {
		Dish dish=Dish.builder().dishname("Biryani").price(250).build();
		Mockito.when(dishRepository.save(dish)).thenReturn(dish);
		assertEquals(dish.getDishname() ,"Biryani");
	}

	
}

package com.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.system.entity.Dish;
import com.system.entity.Dish.DishBuilder;

public interface DishRepository extends JpaRepository<Dish,Integer> {

	@Query("from Dish where dishName like :s%")
	List<Dish> getDishByName(@Param("s") String dishName);
	
	
	@Query("from Dish where dishPrice =:s")
	List<Dish> getDishByPrice(@Param("s")long dishPrice);


	
}


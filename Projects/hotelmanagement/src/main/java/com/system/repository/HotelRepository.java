package com.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.system.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Integer> {
	
	@Query("from hotel where hotelname =:s")
	List<Hotel> getHotelByHotelName(@Param("s") String hotelname);
	
	@Query("from hotel where phone =:s%")
	List<Hotel> getHotelByPhone(@Param("s") long phone);
	
	@Query("from hotel where email =:s")
	List<Hotel> getHotelByEmail(@Param("s") String email);
	
	@Query("from hotel where dish_id =:s")
	List<Hotel> getHotelByDish(@Param("s") int id);

}

package com.example.studentdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentdata.model.Data;

public interface DataRepository extends JpaRepository<Data, Long> {
	List<Data> findByResult(boolean result);
	List<Data> findByNameContaining(String name);
	
}

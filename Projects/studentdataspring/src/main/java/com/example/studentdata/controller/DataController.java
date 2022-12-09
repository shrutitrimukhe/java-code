package com.example.studentdata.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdata.model.Data;
import com.example.studentdata.repository.DataRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class DataController {

	@Autowired
	DataRepository dataRepository;

	@GetMapping("/studentdata")
	public ResponseEntity<List<Data>> getAllstudentdata(@RequestParam(required = false) String name) {
		try {
			List<Data> data = new ArrayList<Data>();

			if (name == null)
				dataRepository.findAll().forEach(data::add);
			else
				dataRepository.findByNameContaining(name).forEach(data::add);

			if (data.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/studentdata/{id}")
	public ResponseEntity<Data> getTutorialById(@PathVariable("id") long id) {
		Optional<Data> studentData = dataRepository.findById(id);

		if (studentData.isPresent()) {
			return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/studentdata")
	public ResponseEntity<Data> createTutorial(@RequestBody Data data) {
		try {
			Data _data = dataRepository
					.save(new Data(0, data.getName(), data.getCourse(),false , data.getDescription()));
			return new ResponseEntity<>(_data, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/studentdata/{id}")
	public ResponseEntity<Data> updateData(@PathVariable("id") long id, @RequestBody Data data) {
		Optional<Data> studentData = dataRepository.findById(id);

		if (studentData.isPresent()) {
			Data _data = studentData.get();
			_data.setName(data.getName());
			_data.setCourse(data.getCourse());
			_data.setResult(data.isResult());
			_data.setDescription(data.getDescription());
			return new ResponseEntity<>(dataRepository.save(_data), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/studentdata/{id}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
		try {
			dataRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/studentdata")
	public ResponseEntity<HttpStatus> deleteAllTutorials() {
		try {
			dataRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/studentdata/result")
	public ResponseEntity<List<Data>> findByResult() {
		try {
			List<Data> studentdata = dataRepository.findByResult(false);

			if (studentdata.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(studentdata, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

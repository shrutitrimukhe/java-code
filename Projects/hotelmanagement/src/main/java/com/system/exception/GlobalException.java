package com.system.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


import com.system.exception.DishNotFoundException;


@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(HotelNotFoundException.class)
	public ResponseEntity<?> hotelNotFoundHandling(HotelNotFoundException exception,WebRequest request){
		ErrorDetails error = new ErrorDetails(exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
@ExceptionHandler(DishNotFoundException.class)
	public ResponseEntity<?> DishNotFoundHandling(DishNotFoundException exception,WebRequest request){
		ErrorDetails error = new ErrorDetails(exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}          

}

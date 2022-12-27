package com.system.model;




import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

@Getter
@Setter


public class DishDTO{
	
	private int dish_id;
	@NotNull
	@Size(min=1)
	private String dishname;
	@NotNull
	@Size(min=1,max=5)
	private long price;
	
}

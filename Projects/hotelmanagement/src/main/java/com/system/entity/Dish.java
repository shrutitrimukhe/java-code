package com.system.entity;

import javax.persistence.*;



import lombok.*;

//@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dish")

public class Dish {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="dishname")
	private String dishname;
	
	@Column(name="price")
	private long price;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//private Hotel hotel;



@Builder
public Dish( String dishname, long price) {
	super();
	this.dishname = dishname;
	this.price = price;
	
}

}

package com.system.entity;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@JsonIgnoreProperties({"hibernateLazyInitialier"})
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="hotel")

public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotel_id;
	
	@Column(name="hotelname", unique= true, length =50)
	private String hotelname;
	
	@Column(name="phone", unique= true, length =50)
	private long phone; 
	
	@Column(name="email", unique= true, length=50)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="dish_id")
	private Dish dish;
   
	
	@Builder
	public Hotel( String hotelname, long phone, String email) {
		super();
		this.hotelname = hotelname;
		this.phone = phone;
		this.email = email;
	}	
	

	
}

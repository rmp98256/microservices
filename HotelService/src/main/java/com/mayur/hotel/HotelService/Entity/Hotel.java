package com.mayur.hotel.HotelService.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hotels")
public class Hotel {

	@Id
	private String id;
	
	private String name;
	
	private String address;
	
	
	
}

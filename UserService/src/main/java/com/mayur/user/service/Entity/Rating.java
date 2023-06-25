package com.mayur.user.service.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
  
	private String ratingid;
	
	private String userid;
	
	private String hotelid;
	
	private int rating;
	
	private String remark;
	
	
	private Hotel hotel;
	
}

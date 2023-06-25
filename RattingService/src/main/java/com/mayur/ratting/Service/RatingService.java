package com.mayur.ratting.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mayur.ratting.Entity.Rating;

@Service
public interface RatingService {
	
	//create
	Rating create(Rating rating);
	
	//get all rating 
	List<Rating> getRatings();
	
	//User vice ratting details
	List<Rating> getRatingByUserId(String Id);
	
	//Get all by hotel 
	List<Rating> getRatingByHotelId(String Id);
}

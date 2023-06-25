package com.mayur.ratting.Reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayur.ratting.Entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{
	
	//custom finder mathods 
	
	List<Rating> findByUserid(String id);
	
	List<Rating> findByHotelid(String id);
	
	
	

}

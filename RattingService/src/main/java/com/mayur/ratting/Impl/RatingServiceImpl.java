package com.mayur.ratting.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayur.ratting.Entity.Rating;
import com.mayur.ratting.Reposetory.RatingRepository;
import com.mayur.ratting.Service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating create(Rating rating) {
		String ratingid= UUID.randomUUID().toString();
		rating.setRatingid(ratingid);
		return ratingRepository.save(rating);
		
	}

	@Override
	public List<Rating> getRatings() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String Id) {
		return ratingRepository.findByUserid(Id);
	}

	@Override
	public List<Rating> getRatingByHotelId(String Id) {
		
		return ratingRepository.findByHotelid(Id);
	}
	

}

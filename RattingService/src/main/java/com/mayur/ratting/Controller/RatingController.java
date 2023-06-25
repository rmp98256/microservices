package com.mayur.ratting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.ratting.Entity.Rating;
import com.mayur.ratting.Service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
	{
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.create(rating));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getRating()
	{
		return ResponseEntity.ok(ratingService.getRatings());
	}
	
	@GetMapping("/userid/{userid}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userid)
	{
		return ResponseEntity.ok(ratingService.getRatingByUserId(userid));
	}
	

	@GetMapping("/hotelid/{hotelid}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelid)
	{
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelid));
	}
	
}

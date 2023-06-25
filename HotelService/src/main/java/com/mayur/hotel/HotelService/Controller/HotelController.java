package com.mayur.hotel.HotelService.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.hotel.HotelService.Entity.Hotel;
import com.mayur.hotel.HotelService.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
    @Autowired
	private HotelService hotelService;
	//create
    @PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}
	
	
	//get sngle
    @GetMapping("/{hotelid}")
    public ResponseEntity<Hotel> createHotel(@PathVariable String hotelid)
	{
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.gethotelbyid(hotelid));
	}
	
	
	//get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll()
    {
    	return ResponseEntity.ok(hotelService.getallhotel());
    }
}

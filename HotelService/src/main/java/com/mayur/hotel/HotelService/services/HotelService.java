package com.mayur.hotel.HotelService.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mayur.hotel.HotelService.Entity.ArtifactSHAPojo;
import com.mayur.hotel.HotelService.Entity.Hotel;

public interface HotelService {

	//create
	Hotel create ( Hotel hotel);
	
	//getall
	List<Hotel> getallhotel();
	
	//getsinglehotel
	Hotel gethotelbyid(String id);
	
	ArtifactSHAPojo getartifactstatus( ArtifactSHAPojo artifactSHAPojo);
	
	
}

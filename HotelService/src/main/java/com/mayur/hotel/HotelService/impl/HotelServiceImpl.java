package com.mayur.hotel.HotelService.impl;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.mayur.hotel.HotelService.Entity.ArtifactSHAPojo;
import com.mayur.hotel.HotelService.Entity.Hotel;
import com.mayur.hotel.HotelService.repository.HotelRepository;
import com.mayur.hotel.HotelService.services.HotelService;
import com.mayur.hotel.HotelService.Exception.*;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getallhotel() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel gethotelbyid(String id) {
		
		return hotelRepository.findById(id).orElseThrow(() -> new ResouceNotFoundException(" Resource not found in database  for id " + id));
	}

	@Override
	public ArtifactSHAPojo getartifactstatus(ArtifactSHAPojo artifactSHAPojo) {
		// TODO Auto-generated method stub
		return null;
	}

}

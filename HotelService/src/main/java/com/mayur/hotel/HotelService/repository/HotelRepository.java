package com.mayur.hotel.HotelService.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mayur.hotel.HotelService.Entity.*;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}

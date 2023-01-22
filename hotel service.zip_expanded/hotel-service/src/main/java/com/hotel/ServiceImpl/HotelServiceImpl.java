package com.hotel.ServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Exception.ResourceNotFoundException;
import com.hotel.Repositroy.HotelRepository;
import com.hotel.Service.HotelService;
import com.hotel.entities.Hotel;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository repository;

	@Override
	public Hotel create(Hotel hotel) {
		
		String hotelId =  UUID.randomUUID().toString();
		hotel.setHid(hotelId);		
		return this.repository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {

		return this.repository.findAll();
	}

	@Override
	public Hotel gethotel(String id) {
		
		return this.repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id Not foud ???"));
	}

}

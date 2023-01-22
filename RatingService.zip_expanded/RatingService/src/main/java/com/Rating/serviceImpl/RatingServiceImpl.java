package com.Rating.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rating.Repository.RatingRepository;
import com.Rating.entities.Rating;
import com.Rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository repository;

	@Override
	public Rating createRating(Rating rating) {
		
		String rid = UUID.randomUUID().toString();
		rating.setRId(rid);
		
		return this.repository.save(rating);
	}

	@Override
	public Rating getRating(String rid) {
		
		return null;
	}

	@Override
	public List<Rating> getRatings() {
		
		return this.repository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		
		return this.repository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		
		return this.repository.findByHotelId(hotelId);
	}

}

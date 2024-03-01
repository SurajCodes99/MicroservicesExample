package com.rating.RatingService.Service;

import com.rating.RatingService.model.Rating;
import com.rating.RatingService.repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating createRating(Rating rating) {return ratingRepo.save(rating);}

    @Override
    public Rating getRatingById(Integer ratingId) {return ratingRepo.findById(ratingId).get();}

    @Override
    public List<Rating> getListofRatings() {return ratingRepo.findAll();}

    @Override
    public List<Rating> getRatingByUserId(Integer userId) {return ratingRepo.findByUserId(userId);}

    @Override
    public List<Rating> getRatingByHotelId(Integer hotelId) {return ratingRepo.findByHotelId(hotelId);}
}

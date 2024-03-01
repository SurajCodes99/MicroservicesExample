package com.rating.RatingService.Service;

import com.rating.RatingService.model.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);
    Rating getRatingById(Integer ratingId);
    List<Rating> getListofRatings();

    List<Rating> getRatingByUserId(Integer userId);

    List<Rating> getRatingByHotelId(Integer hotelId);
}

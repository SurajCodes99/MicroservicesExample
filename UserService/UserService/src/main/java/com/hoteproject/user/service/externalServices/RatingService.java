package com.hoteproject.user.service.externalServices;

import com.hoteproject.user.service.model.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "RATING-SERVICE")
@Service
public interface RatingService {
    @PostMapping("/rating/createRating")
    public Rating createRating(@RequestBody Rating rating);
    @PutMapping("/rating/updateRating/{ratingId}")
    public Rating updateRating(@PathVariable Integer ratingId);
}

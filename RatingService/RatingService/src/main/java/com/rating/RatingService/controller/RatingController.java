package com.rating.RatingService.controller;
import com.rating.RatingService.Service.RatingService;
import com.rating.RatingService.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/createRating")
    public ResponseEntity<?> createRating(@RequestBody Rating rating){return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));}

    @GetMapping("/getRatingByRatingId/{ratingId}")
    public ResponseEntity<?> getRatingByRatingId(@PathVariable Integer ratingId){return ResponseEntity.ok(ratingService.getRatingById(ratingId));}

    @GetMapping("/getRatingByUserId/{userId}")
    public ResponseEntity<?> getRatingByUserId(@PathVariable Integer userId){return ResponseEntity.ok(ratingService.getRatingByUserId(userId));}

    @GetMapping("/getRatingByHotel/{hotelId}")
    public ResponseEntity<?> getRatingByHotelId(@PathVariable Integer hotelId){return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));}

    @GetMapping("/getListOfRatings")
    public ResponseEntity<List<Rating>> getListOfRatings(){return ResponseEntity.ok(ratingService.getListofRatings());}
}

package com.hoteproject.user.service;

import com.hoteproject.user.service.externalServices.RatingService;
import com.hoteproject.user.service.model.Rating;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private RatingService ratingService;

	@Test
	public void createRating(){
		Rating rating = Rating.builder().rating(10).feedback("Rating from test class #2.").build();
		Rating savedRating = ratingService.createRating(rating);
		System.out.println("New rating created.");
	}
}

package com.hoteproject.user.service.service;

import com.hoteproject.user.service.exceptions.ResourceNotFoundException;
import com.hoteproject.user.service.externalServices.HotelService;
import com.hoteproject.user.service.model.Hotel;
import com.hoteproject.user.service.model.Rating;
import com.hoteproject.user.service.model.User;
import com.hoteproject.user.service.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUser() {return userRepository.findAll();}

    @Override
    public User getUser(Integer userId) {
        User user =  userRepository.findById(userId).orElseThrow(ResourceNotFoundException::new);

        // To fetch rating for the above user:
        // This is the URL used: localhost:8083/rating/getRatingByUserId/153
        Rating[] ratingsOfUser = restTemplate.getForObject("http://RATING-SERVICE/rating/getRatingByUserId/"+userId, Rating[].class);
        logger.info("{}",ratingsOfUser);

        List<Rating> ratings = Arrays.asList(ratingsOfUser);

        List<Rating> ratingList = new ArrayList<>();
        for(Rating rating : ratings){
            Hotel hotel = hotelService.getHotel(rating.getHotelId());
            rating.setHotel(hotel);
            ratingList.add(rating);
        }

        user.setRatingList(ratingList);
        return user;
    }
}

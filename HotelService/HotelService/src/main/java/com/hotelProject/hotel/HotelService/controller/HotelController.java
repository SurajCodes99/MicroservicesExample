package com.hotelProject.hotel.HotelService.controller;

import com.hotelProject.hotel.HotelService.Service.HotelService;
import com.hotelProject.hotel.HotelService.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/createHotel")
    public ResponseEntity<?> createHotel(@RequestBody Hotel hotel){return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));}

    @GetMapping("/getById/{hotelId}")
    public ResponseEntity<?> getHotelById(@PathVariable Integer hotelId){return ResponseEntity.ok().body(hotelService.getHotelById(hotelId));}

    @GetMapping("/getListOfHotels")
    public ResponseEntity<?> getListOfHotels(){return ResponseEntity.ok().body(hotelService.getListOfHotels());}
}

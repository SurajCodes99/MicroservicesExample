package com.hotelProject.hotel.HotelService.Service;

import com.hotelProject.hotel.HotelService.model.Hotel;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);
    Hotel getHotelById(Integer id);
    List<Hotel> getListOfHotels();
}

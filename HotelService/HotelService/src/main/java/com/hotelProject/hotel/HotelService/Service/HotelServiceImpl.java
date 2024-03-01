package com.hotelProject.hotel.HotelService.Service;

import com.hotelProject.hotel.HotelService.model.Hotel;
import com.hotelProject.hotel.HotelService.repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel createHotel(Hotel hotel) {return hotelRepo.save(hotel);}

    @Override
    public Hotel getHotelById(Integer id) {return hotelRepo.findById(id).get();}

    @Override
    public List<Hotel> getListOfHotels() {return hotelRepo.findAll();}
}

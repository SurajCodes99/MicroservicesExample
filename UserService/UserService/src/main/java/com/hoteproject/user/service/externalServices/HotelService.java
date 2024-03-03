package com.hoteproject.user.service.externalServices;

import com.hoteproject.user.service.model.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {
    @GetMapping("/hotels/getById/{hotelId}")
    Hotel getHotel(@PathVariable Integer hotelId);
}
//Testing if the push goes through
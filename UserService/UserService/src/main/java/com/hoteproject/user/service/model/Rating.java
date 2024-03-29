package com.hoteproject.user.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
    private Integer ratingId;
    private Integer userId;
    private Integer hotelId;
    private int rating;
    private String feedback;
    private Hotel hotel;
}

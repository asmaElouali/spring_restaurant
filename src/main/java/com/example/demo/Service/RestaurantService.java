package com.example.demo.Service;

import com.example.demo.Dto.RestaurantDto;
import com.example.demo.Entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant addRestaurant(RestaurantDto restaurantDto);
    List<Restaurant> getRestaurants();

}

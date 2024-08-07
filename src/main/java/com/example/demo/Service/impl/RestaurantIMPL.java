package com.example.demo.Service.impl;

import com.example.demo.Dto.RestaurantDto;
import com.example.demo.Entity.Restaurant;
import com.example.demo.Repository.RestaurantRepository;
import com.example.demo.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantIMPL implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Restaurant addRestaurant(RestaurantDto restaurantDto) {
        Restaurant restaurantDto1=new Restaurant(restaurantDto.getId(),restaurantDto.getName());
        return restaurantRepository.save(restaurantDto1);
    }

    @Override
    public List<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }


}

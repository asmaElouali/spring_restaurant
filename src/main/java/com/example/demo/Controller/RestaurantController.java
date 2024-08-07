package com.example.demo.Controller;

import com.example.demo.Dto.RestaurantDto;
import com.example.demo.Dto.ServerDto;
import com.example.demo.Entity.Restaurant;
import com.example.demo.Service.RestaurantService;
import com.example.demo.Service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/save")
    public Restaurant saveRestaurant(@RequestBody RestaurantDto restaurantDto){
        Restaurant id = restaurantService.addRestaurant(restaurantDto);
        return id;
    }

    @GetMapping("/getAllRestaurant")
    public List<Restaurant> getRestaurant(){
        return restaurantService.getRestaurants();
    }


}

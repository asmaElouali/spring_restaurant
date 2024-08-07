package com.example.demo.Service;

import com.example.demo.Dto.LoginDto;
import com.example.demo.Dto.RestaurantDto;
import com.example.demo.Dto.ServerDto;
import com.example.demo.Entity.Restaurant;
import com.example.demo.Response.LoginResponse;



public interface ServerService {
    String addServer(ServerDto serverDTO);

    LoginResponse loginServer(LoginDto loginDto);

    String getRestaurantNameById(Integer id);

}

package com.example.demo.Service.impl;

import com.example.demo.Dto.LoginDto;
import com.example.demo.Dto.RestaurantDto;
import com.example.demo.Dto.ServerDto;
import com.example.demo.Entity.Restaurant;
import com.example.demo.Entity.Server;
import com.example.demo.Repository.ServerRepository;
import com.example.demo.Response.LoginResponse;
import com.example.demo.Service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServerIMPL implements ServerService {

    @Autowired
    private ServerRepository serverRepository;

    @Autowired
    private PasswordEncoder numEncoder;


    @Override
    public String addServer(ServerDto serverDTO) {
        Server server = new Server(
                serverDTO.getId(),
                serverDTO.getFirstname(),
                serverDTO.getLastname(),
                this.numEncoder.encode(serverDTO.getNum()),
                serverDTO.getRestaurant()
        );
        serverRepository.save(server);
        return server.getFirstname();
    }

    @Override
    public LoginResponse loginServer(LoginDto loginDto) {
        String msg = "";
       // String firstname = loginDto.getFirstname();
        //String num = loginDto.getNum();
        Server server1 = serverRepository.findByFirstname(loginDto.getFirstname());
        System.out.println("Incoming num: " + server1);
        if (server1 != null) {
            String num = loginDto.getNum();
            String encodedNum = server1.getNum();
            Boolean isNumRight = numEncoder.matches(num, encodedNum);
            if (isNumRight) {
                Optional<Server> server2 = serverRepository.findOneByFirstnameAndNum(loginDto.getFirstname(),encodedNum);
                System.out.println("Incoming num2: " + server2);
                if (server2.isPresent()) {
                    return new LoginResponse("Login Success", true,server2.get().getId());
                } else {
                    return new LoginResponse("login failed", false);
                }
            } else {
                return new LoginResponse("password not match", false);
            }
        } else {

            return new LoginResponse("Email not exist", false);
        }
    }



    @Override
    public String getRestaurantNameById(Integer id) {
        Optional<Server> restaurant=serverRepository.findById(id);
        return restaurant.get().getRestaurant().getName();
    }

}

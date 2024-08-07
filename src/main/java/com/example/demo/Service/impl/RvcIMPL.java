package com.example.demo.Service.impl;

import com.example.demo.Dto.RvcDto;
import com.example.demo.Entity.Rvc;
import com.example.demo.Repository.RvcRepository;
import com.example.demo.Service.RvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RvcIMPL implements RvcService {
    @Autowired
    private RvcRepository rvcRepository;

    @Override
    public Rvc addRvc(RvcDto rvcDto) {
        Rvc rvc = new Rvc(rvcDto.getId(),rvcDto.getName(),rvcDto.getRestaurant());
        return rvcRepository.save(rvc);
    }
}

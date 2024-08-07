package com.example.demo.Controller;

import com.example.demo.Dto.RvcDto;
import com.example.demo.Dto.ServerDto;
import com.example.demo.Entity.Rvc;
import com.example.demo.Service.RvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rvc")
public class RvcController {
    @Autowired
    private RvcService rvcService;

    @PostMapping("/save")
    public Rvc saveRvc(@RequestBody RvcDto rvcDto){
        Rvc id = rvcService.addRvc(rvcDto);
        return id;
    }
}

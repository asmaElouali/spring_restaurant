package com.example.demo.Controller;

import com.example.demo.Dto.LoginDto;
import com.example.demo.Dto.ServerDto;
import com.example.demo.Entity.Server;
import com.example.demo.Repository.ServerRepository;
import com.example.demo.Response.LoginResponse;
import com.example.demo.Service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/server")
@CrossOrigin(origins = "*")
public class ServerController {

    @Autowired
    private ServerService serverService;

   /* @Autowired
    private ServerRepository serverRepository;
    @PostMapping("/")
    public ResponseEntity<?> addServer(@RequestBody Server server)
    {
        Server save = this.serverRepository.save(server);
        return ResponseEntity.ok(save);
    }
    @GetMapping("/")
    public ResponseEntity<?> getServer()
    {
        return ResponseEntity.ok(this.serverRepository.findAll());
    }*/

    @PostMapping("/save")
    public String saveServer(@RequestBody ServerDto serverDTO){
        String id = serverService.addServer(serverDTO);
        return id;
    }
    @PostMapping("/login")
    public ResponseEntity<?> loginServer(@RequestBody LoginDto loginDto){
        LoginResponse loginResponse = serverService.loginServer(loginDto);
        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping("/getRestaurantName/{id}")
    public String getRestaurantName(@PathVariable Integer id){
        String name = serverService.getRestaurantNameById(id);
        return name;
    }

}

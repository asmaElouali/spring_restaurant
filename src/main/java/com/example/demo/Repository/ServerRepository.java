package com.example.demo.Repository;

import com.example.demo.Dto.LoginDto;
import com.example.demo.Entity.Restaurant;
import com.example.demo.Entity.Server;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface ServerRepository extends JpaRepository<Server,Integer> {

    Optional<Server> findOneByFirstnameAndNum(String firstname, String num);

    Server findByFirstname(String firstname);
    Optional<Server> findById(Integer id);

}

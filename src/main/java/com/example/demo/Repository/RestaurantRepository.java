package com.example.demo.Repository;

import com.example.demo.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {

      List<Restaurant> findAll();

}

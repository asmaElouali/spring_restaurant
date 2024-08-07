package com.example.demo.Repository;

import com.example.demo.Entity.Rvc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RvcRepository extends JpaRepository<Rvc,Integer> {

}

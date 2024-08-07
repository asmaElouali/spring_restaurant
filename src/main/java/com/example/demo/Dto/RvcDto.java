package com.example.demo.Dto;

import com.example.demo.Entity.Restaurant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RvcDto {
    private Integer id;
    private String name;
    private Restaurant restaurant;
}

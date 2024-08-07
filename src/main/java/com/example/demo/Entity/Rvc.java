package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Rvc {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @Override
    public String toString() {
        return "Rvc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

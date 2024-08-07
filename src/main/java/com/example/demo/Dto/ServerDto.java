package com.example.demo.Dto;

import com.example.demo.Entity.Restaurant;
import lombok.*;
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.Indexed;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class ServerDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private String num;
    private Restaurant restaurant;

    /*public ServerDto() {
    }

    public ServerDto(Integer id, String firstname, String lastname, String num) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ServerDto{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", num=" + num +
                '}';
    }*/
}

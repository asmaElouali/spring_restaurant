package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="server")
public class Server {
    @Id
    @Column(name="employee_id", length = 45)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name="server_name", length = 255)
    private String firstname;
    @Column(name="server_lastname", length = 255)
    private String lastname;
    @Column(name="num", length = 255)
    private String num;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    /*public Server(Integer id, String firstname, String lastname, String num) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.num = num;
    }

    public Server() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
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
*/
    @Override
    public String toString() {
        return "Server{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", num=" + num +
                '}';
    }
}

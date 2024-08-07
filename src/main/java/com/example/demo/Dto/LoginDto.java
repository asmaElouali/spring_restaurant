package com.example.demo.Dto;

public class LoginDto {

    private String firstname;
    private String num;

    public LoginDto(String firstname, String num) {
        this.firstname = firstname;
        this.num = num;
    }

    public LoginDto() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }


    @Override
    public String toString() {
        return "LoginDto{" +
                "firstname='" + firstname + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}

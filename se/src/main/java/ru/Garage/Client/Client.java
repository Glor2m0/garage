package ru.Garage.Client;

import ru.Garage.car.Car;

import java.util.*;

// name - client name
// id -unique client number
// Car - his car

public class Client {
    private String firstname;
    private String lastname;
    private int id;
    private int age;
    private String telephone;
    private String sity;
    private Car car;

    public Client(){

    }

    public Client(int id, String firstname, String lastname,  int age, String telephone, String sity, Car car) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
        this.telephone = telephone;
        this.sity = sity;
        this.car = car;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getSity() {
        return sity;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

/*
    public void addCar(Car car) {
        this.car.add(car);
    }
*/


    public Car getCars (){
        return this.car;
    }





}

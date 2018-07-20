package ru.Garage.Client;

import ru.Garage.car.Car;

import java.util.Collection;

// name - client name
// id -unique client number
// Car - his car

public class Client {
    private String name;
    private int id;
    private Collection<Car> car;

    public Client(int id, String name, Collection<Car> car) {
        this.name = name;
        this.id = id;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addCar(Car car) {
        this.car.add(car);
    }

    public Collection<Car> getCars (){
        return this.car;
    }


}

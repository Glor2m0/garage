package ru.Garage;

import ru.Garage.Client.Client;
import ru.Garage.car.Car;

import java.util.*;

public class GarageRunner {
    public static void main(String[] args) {

        LinkedList<Client> clients = new LinkedList<Client>();
        LinkedList<Car> cars = new LinkedList<Car>();
        //clients.add(new Client(1,"Peter", age, telephone, sity, cars));
       // cars.add(1,new Car(0,"223"));






        for (Car c: cars) {
            System.out.println(c.getModel());

        }



    }
}

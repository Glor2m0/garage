package ru.Garage.car;

//model is model of car
//id is unique number of car in garage
public class Car  {

    private String model;
    private int id;

    public Car(int id, String model) {
        this.model = model;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getModel (){
        return model;
    }


}

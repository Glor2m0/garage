package ru.Garage.car;

//model is model of car
//id is unique number of car in garage
public class Car  {

    private String model;
    private int id;
    private String color;
    private String numberC;

    public Car(int id, String model, String color, String numberC) {
        this.model = model;
        this.id = id;
        this.color = color;
        this.numberC = numberC;
    }

    public int getId() {
        return id;
    }
    public String getModel (){
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getNumberC() {
        return numberC;
    }
}

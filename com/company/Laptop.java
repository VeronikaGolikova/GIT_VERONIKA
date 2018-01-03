package com.company;

public class Laptop {

    private String model = "HP Pavilion 15-cc500";
    double diagonal = 15.6;
    String CPU = "Процессор Intel® Core™ i7-7500U";

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
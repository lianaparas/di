package com.enigma.di;

public class Car {
    private Integer wheel;

    private String color;

    public Car(Integer wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }

    public Integer getWheel() {
        return this.wheel;
    }

    public String getColor() {
        return this.color;
    }

    public void setWheel(Integer wheel){
        this.wheel = wheel;
    }

    public void setColor(String color){
        this.color = color;
    }

}

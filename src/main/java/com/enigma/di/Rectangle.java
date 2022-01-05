package com.enigma.di;

public class Rectangle {

    private Double height;

    private Double width;

    public Rectangle(Double height, Double width){
        this.height = height;
        this.width = width;
    }

    public Double getSurface(){
        return this.height * this.width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
}

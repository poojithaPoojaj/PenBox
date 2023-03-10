package com.project.penbox.objects;

public class Pen {
    String color;
    String typeOfPen;
    public Pen(String color,String typeOfPen){
        this.color=color;
        this.typeOfPen=typeOfPen;
    }

    public String getColor() {
        return color;
    }

    public String getTypeOfPen() {
        return typeOfPen;
    }
}

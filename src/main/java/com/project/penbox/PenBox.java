package com.project.penbox;

import com.project.penbox.objects.Pen;

import java.util.ArrayList;

public class PenBox {

    ArrayList<Pen> box=new ArrayList();
    public void add(Pen pen){
        box.add(pen);
    }
    public void remove(Pen pen){
        box.remove(pen);
    }
    public ArrayList<Pen> getBoxItems(){
        return box;
    }
    public int getPensWithGivenColor(String color){
        int totalBluePens=0;
        for(int i=0;i<this.box.size();i++){
            if(this.box.get(i).getColor().equalsIgnoreCase(color)){
              totalBluePens++;
            }
        }
        return totalBluePens;
    }
    public static void main(String[] args) {
        PenBox penbox=new PenBox();
        penbox.add(new Pen("blue","Sketch"));
        penbox.add(new Pen("red","Sketch"));
        System.out.println(  "Total No of Blue pens in the box is :"+  penbox.getPensWithGivenColor("blue"));


    }

}

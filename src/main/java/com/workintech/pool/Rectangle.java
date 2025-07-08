package com.workintech.pool;

public class Rectangle {

    private double width,length;

    public Rectangle(double width,double height){
        this.width=Math.max(width,0);
        this.length=Math.max(height,0);
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
      return this.width*this.length;
    }
}

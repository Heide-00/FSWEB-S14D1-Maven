package com.workintech.pool;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width,double length,double height){
        super(width,length);
        this.height=Math.max(height,0);
    }

   public double getHeight(){
     return height;
   }

   public double getVolume(){
        return super.getArea()*this.getHeight();
   }
}

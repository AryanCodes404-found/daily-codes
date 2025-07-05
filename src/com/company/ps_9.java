package com.company;


class Cylinder {
    private int radius, height;
    private float volume,surfaceArea;
float pi=3.14f;

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public float getSurfaceArea() {
        return (float) (2*Math.PI*radius*(radius+height));
    }

    public float getVolume() {
        return (float) (Math.PI*pi*radius*radius*height);
    }
} class Rectangle {
    private int length, breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }


    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

}
    public class ps_9 {
        public static void main(String[] args) {
            Cylinder obj=new Cylinder(25,12);
            obj.setRadius(5);
        obj.setHeight(12);
            Rectangle r=new Rectangle(12,56);
            System.out.println(obj.getSurfaceArea());
            System.out.println(obj.getVolume());
            System.out.println(r.getBreadth());
            System.out.println(r.getLength());}}


package com.company;

public class Practice_Problem08 {
    public static void main(String[] args) {
        cylinder clnd = new cylinder(9.0f, 12.f);
        //clnd.setHeight(12.0f);
        //float h = clnd.getHeight();
        //System.out.println("Hight of Cylinder is " + h);
        //clnd.setRadius(9.0f);
        //float r = clnd.getRadius();
        //System.out.println("Radius of Cylinder is " + r);
        double surfaceAreaClnd = clnd.surfaceArea();
        System.out.println(surfaceAreaClnd);

        Rectangle rect = new Rectangle();
        System.out.println(rect.getBreadth());
        System.out.println(rect.getLength());

        Rectangle rect1 = new Rectangle(12,16);
        System.out.println(rect1.getBreadth());
        System.out.println(rect1.getLength());
    }
}

class cylinder{
    private float radius;
    private float height;

    public cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

//    public float getRadius() {
//        return radius;
//    }
//
//    public void setRadius(float radius) {
//        this.radius = radius;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public void setHeight(float height) {
//        this.height = height;
//    }

    public double surfaceArea(){
        double pie = 22.00/7.00;
        double area = (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
        return area;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        length = 5;
        breadth = 6;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

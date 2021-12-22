package com.company;

public class Learn_Inheritance {
    public static void main(String[] args) {
    //vehicle veh1 = new vehicle();
    car car1 = new car();
    vehicle veh2 = new vehicle("Yellow");
//    String vehColour = veh1.Colour = "Red";
//    int wheels = veh1.wheels = 4;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}

class vehicle{
    vehicle(){
        System.out.println("This is parent/base constructor.");
    }
    vehicle(String colour){
        System.out.println("This is parent/base constructor with overloaded method " + colour);
    }
    int wheels;
    String Colour;
    int price;
    String Engine;
}
class car extends vehicle{
    int carWheeels;
    String carColor;
    String carCompany;
    car(){
        super("Grey");
        System.out.println("This is child of Vehicle class");
    }
}
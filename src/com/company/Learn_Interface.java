package com.company;

interface bicycle{
     void applyBreak(int decrement);
     void speedUp(int increment);
}

interface wheels{
    void twoWheels();
    void horn();
    void mirror();
}

class vehicle1{
    public void truck(){
        System.out.println("This is a truck");
    }
    public void cycleTwoWheeler(){
        System.out.println("Cycle is two wheeler");
    }
}

class bicycle1 extends vehicle1 implements bicycle, wheels{

    @Override
    public void cycleTwoWheeler() {
        System.out.println("Two wheeler");
    }

    @Override
    public void applyBreak(int decrement) {
        System.out.println("Please apply break with " + decrement);
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("Please speed up " + increment);
    }

    @Override
    public void twoWheels() {
        System.out.println("Cycle should have two wheels.");
    }

    @Override
    public void horn() {
        System.out.println("Horn OK Please");
    }
    @Override
    public void mirror(){
        System.out.println("Cycle should have a mirror.");
    }
}

public class Learn_Interface {
    public static void main(String[] args) {
        bicycle1 cycle1 = new bicycle1();
        cycle1.applyBreak(10);
        cycle1.speedUp(5);
        cycle1.twoWheels();
        cycle1.horn();
        cycle1.mirror();
        cycle1.cycleTwoWheeler();
    }
}

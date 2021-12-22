package com.company;

abstract class base{
    public base(){
        System.out.println("This is base constructor");
    }
    public void hello(){
        System.out.println("Greetings for the day !");
    }

    abstract public void greet();
}

class child extends base{
    @Override
    public void greet() {
        System.out.println("Have a good day.");
    }
}

public class Learn_Abstract {
    public static void main(String[] args) {
        //base b = new base();
        child c1 = new child();
        c1.greet();
        c1.hello();
    }
}

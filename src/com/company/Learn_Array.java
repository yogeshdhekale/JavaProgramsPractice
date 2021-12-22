package com.company;

public class Learn_Array {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0]=98;
        marks[1]=97;
        marks[2]=96;
        marks[3]=95;
        marks[4]=94;
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("*************************");

       // String [] days = new String[7];
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int j=0; j<days.length; j++){
            System.out.println(days[j]);
        }
        System.out.println("*************************");

        for (String element: days){
            System.out.println(element);
        }
    }
}

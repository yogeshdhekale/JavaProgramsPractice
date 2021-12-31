package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Learn_ArrayList_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> test_int = new LinkedList<>();
        test_int.add(45);
        test_int.add(30);
        test_int.add(15);
        test_int.add(60);
        test_int.addLast(75);
        test_int.addFirst(90);
        test_int.add(3, 105);
        for (int element: test_int
             ) {
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++");

        //ArrayDeque
        ArrayDeque<String> cities = new ArrayDeque<>();
        cities.add("Zurich");
        cities.add("Bern");
        cities.add("Geneva");
        cities.add("Basel");
        cities.offerLast("Olten");
        cities.add("Locarno");
        cities.add("Lausanne");
        cities.addFirst("Winterthur");
        //for(int i = 0; i<cities.size(); i++){
            System.out.println(cities);

    }
}

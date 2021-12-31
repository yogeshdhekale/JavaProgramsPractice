package com.company;

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
        for (int element: test_int
             ) {
            System.out.print(element + " ");
        }
    }
}

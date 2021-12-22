package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner marks = new Scanner(System.in);
        System.out.println("Please input marks of first subject");
        int a = marks.nextInt();
        System.out.println("Please input marks of second subject");
        int b = marks.nextInt();
        System.out.println("Please input marks of third subject");
        int c = marks.nextInt();
        System.out.println("Please input marks of fourth subject");
        int d = marks.nextInt();
        System.out.println("Please input marks of fifth subject");
        int e = marks.nextInt();

        int total_marks = a + b + c + d + e;
        System.out.println("Total marks " + total_marks);

        double percentage_marks = total_marks*100/500;
        System.out.println("Percentage marks are " + "%" +percentage_marks);
    }
}

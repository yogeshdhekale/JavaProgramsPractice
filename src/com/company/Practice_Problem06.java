package com.company;

import java.util.Scanner;

public class Practice_Problem06 {
    public static void main(String[] args) {
        float [] dist = {32.1f, 33.5f, 36.3f, 78.1f, 21.2f};
        float sum = 0.0f;
        for (int i =0; i<dist.length; i++){
            sum = sum + dist[i];
        }
        System.out.println(sum);

        System.out.println("**********************************");

        Scanner scn = new Scanner(System.in);
        int a;
        System.out.println("Please enter a number for verification");
        a = scn.nextInt();
        boolean IsPresent = false;

        int [] arr = {12, 34, 13, 45, 11, 22, 33, 67, 99, 00};

        for (int i = 0; i<arr.length; i++){
            if (arr[i] == a){
                IsPresent = true;
                break;
            }
        }
        if (IsPresent){
            System.out.println(a + " is present in array.");
        }
        else
            System.out.println(a + " is not present in array.");

        System.out.println("**********************************");

        int [] marks = {98,97,99};
        int sumMarks = 0;
        for(int element: marks){
            sumMarks = sumMarks + element;
        }
        System.out.println("Average marks are: " + sumMarks/marks.length);

        System.out.println("**********************************");

        int mat1 [][] = {{1,2,3},
                        {3,4,5}};
        int mat2 [][] = {{11,12,13},
                        {13,14,15}};
        int result [][] = {{0,0,0},
                            {0,0,0}};

        for (int i = 0; i<mat1.length; i++){
            for(int j = 0; j<mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("**********************************");

        int arry [] = {12, 14, 16, 18, 20, 10};
        for (int k = arry.length-1; k>=0; k--){
            System.out.print(arry[k] + " ");
        }
        System.out.println("");

        String input;
        String[] words;
        input = "I love Java programming.";

        words = input.split(" ");
        for (int i = words.length -1; i>=0; i--){
            System.out.print(words[i] + " ");
        }

        System.out.println("**********************************");

        int[] arrayMax = {112, 41340, 32, 5743, 5784};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arrayMax.length; i++){
            if(arrayMax[i]>max){
                max = arrayMax[i];
            }
        }
        System.out.println("Maximum number in array is " + max);

        System.out.println("**********************************");

        int[] arrayMin = {-112, -40, -32, -5743, -5784};
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arrayMin.length; i++){
            if(arrayMin[i]<min){
                min = arrayMin[i];
            }
        }
        System.out.println("Minimum number in array is " + min);

        System.out.println("**********************************");

        boolean IsArraySorted = true;
        int[] arraySort = {-112, -40, -32, -5, -4};
        for(int i=0; i<arraySort.length-1; i++){
            if(arraySort[i] > arraySort[i+1]){
                IsArraySorted = false;
            }
        }
        if (IsArraySorted){
        System.out.println("Array is sorted");
        }
        else
            System.out.println("Not sorted");

    }
}

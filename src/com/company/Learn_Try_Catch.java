package com.company;

import com.sun.org.apache.xpath.internal.objects.XNull;

import java.util.Scanner;

public class Learn_Try_Catch {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        try{
            int c = a/b;
            System.out.println("Division result is: " + c);
        }
        catch (Exception exce){
            System.out.println("Unable to divide. Reason is ");
            System.out.print(exce);
        }

        int [] array = new int[4];
        array[0] = 5;
        array[1] = 15;
        array[2] = 25;
        array[3] = 35;
        Scanner sc1  = new Scanner(System.in);
        System.out.println("Please enter array index");
        int index = sc1.nextInt();
        Scanner sc2  = new Scanner(System.in);
        System.out.println("Please enter divisoble number");
        int divisible = sc2.nextInt();

        try{
            System.out.println("Value of index is " + array[index]);
            System.out.println("array_value/number is " + array[index]/divisible);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("ArrayIndexOutOfBoundsException Exception occurred ");
            System.out.print("Description of error is " + e1);
        }
        catch(ArithmeticException e2){
            System.out.println("ArithmeticException exception occurred " + e2);
        }
        catch (Exception e3){
            System.out.println("Some other exception occurred " + e3);
        }

    }


    }






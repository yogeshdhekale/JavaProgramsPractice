package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Learn_FileHandling {
    public static void main(String[] args) {
        /*
        File testFile = new File("TestFile.txt");

        try {
            testFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create a file.");
            e.printStackTrace();
        }

        FileWriter write = null;
        try {
            write = new FileWriter("TestFile.txt");
            write.write("This is QA Testing.\nWelcome to Java programming!");
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        File testFile = new File("TestFile.txt");
        try {
            Scanner sc = new Scanner(testFile);
            while (sc.hasNextLine()){
                String newLine = sc.nextLine();
                System.out.println(newLine);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

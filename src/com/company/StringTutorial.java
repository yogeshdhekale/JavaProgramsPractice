package com.company;

import java.util.Locale;

public class StringTutorial {
    public static void main(String[] args) {

        String name = "Yogesh DHEKALE";
        int length = name.length();
        System.out.println("Length of " + name + " " + "is " + length);

        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);

        String nonTrimmed = "         Yogesh Dhekale from Fribourge, Germany";
        System.out.println(nonTrimmed.length());
        System.out.println(nonTrimmed);
        String trimmedString = nonTrimmed.trim();
        System.out.println(nonTrimmed.trim());
        System.out.println(trimmedString.substring(7,38));
        System.out.println(trimmedString.replace("Fribourge, Germany", "Zuerich, Switzerland"));

        String modified_place = trimmedString.replace("Fribourge, Germany", "Zuerich, Switzerland");
        System.out.println(modified_place);

        System.out.println(trimmedString.endsWith("any"));

        System.out.println(trimmedString.charAt(14));

        System.out.println(trimmedString.indexOf("le"));
        System.out.println(trimmedString.indexOf("e",5));
        System.out.println(trimmedString.lastIndexOf("y"));
        System.out.println(trimmedString.lastIndexOf("Y", 31));

        System.out.println(modified_place.endsWith("and"));

        System.out.println("\"This is Java String tutorial\"");


    }
}

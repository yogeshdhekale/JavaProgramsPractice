package com.company;

public class Java_String_Exercise {

    public static void main(String[] args) {

        //1. Convert string to lowercase.
        String uCase = "THIS IS PRACTICE STRING EXERCISE";
        String lCase = uCase.toLowerCase();
        System.out.println(lCase);

        //2. Replace space with underscore
        String replaceUnderscore = uCase.replace(" ", "_");
        System.out.println(replaceUnderscore);

        //3. Fill a letter template
        String letter = "Dear <|Name|>, Thanks a lot !!!";
        String newTemplate = letter.replace("<|Name|>", "Harry");
        System.out.println(newTemplate);

        //4. Find double and tripple spaces in a String
        String strng = "This is QA  Testing  learning    JAVA";
        System.out.println(strng.indexOf("  "));
        System.out.println(strng.indexOf("   "));

        //5. Form a letter template with escape character
        String letterFormat = "Dear Yogesh, \nThis is Java String Exercise. \nPlease resolve it. \nThank you.";
        System.out.println(letterFormat);



    }
}

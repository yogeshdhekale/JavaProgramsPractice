package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Learn_DateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        System.out.println(d);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTimeZone());

        GregorianCalendar gCal = new GregorianCalendar();
        System.out.println(gCal.isLeapYear(2100));
    }
}

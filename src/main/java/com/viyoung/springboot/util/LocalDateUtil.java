package com.viyoung.springboot.util;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateUtil {

    public static void printNowDayCalender() {
        LocalDate date = LocalDate.now();
        int monthValue = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        //Set to start of month
        date = date.minusDays(dayOfMonth - 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
            while (date.getMonthValue() == monthValue) {
                System.out.printf("%3d",date.getDayOfMonth());
                if (date.getDayOfMonth() == dayOfMonth) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) {
                    System.out.println();
                }
            }
            if (date.getDayOfWeek().getValue() != 1) {
                System.out.println();
            }
        }
    }
}

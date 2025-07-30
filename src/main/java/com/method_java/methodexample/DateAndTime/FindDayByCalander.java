/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.DateAndTime;

/**
 *
 * @author A-11
 */
import java.util.Calendar;
import java.util.Locale;

public class FindDayByCalander {

    public class DayFinderWithCalendar {

        public static void main(String[] args) {
            // Example date: 26 July 2025
            int year = 2025;
            int month = 7; 
            int day = 26;

            Calendar cal = Calendar.getInstance();
            cal.set(year, month-1, day);// July (0-based: Jan = 0)

            String[] weekdays = {
                "", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
            };

            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1 = Sunday, 7 = Saturday

            System.out.println("Day of the week: " + weekdays[dayOfWeek]);
        }
    }

}

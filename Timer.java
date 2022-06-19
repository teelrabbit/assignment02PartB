/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Scanner;

public class Timer {
    static String time_zone;
    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Timer() {
    }

    public static Timer setTimeZonePreference() {
        Scanner myObj = new Scanner(System.in); //taking usr input
        System.out.print("Time Zone: ");
        time_zone = myObj.nextLine(); //lang made
        return new Timer();
    }

    public Object getTimeZoneFormatted() {
        return null;
    }

    //
    // Static Methods
    //

    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}
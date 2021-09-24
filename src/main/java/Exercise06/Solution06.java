/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Garrett Adams
 */
package Exercise06;

import java.util.*;

public class Solution06 {
    public static void main(String[] args) {
        //Initializes Current Date
        int date = Calendar.getInstance().get(Calendar.YEAR);
        //Stores Retirement Age
        int OldAge;
        //Stores Users Current Age
        int UserAge;
        Scanner sw = new Scanner(System.in);

        //Prompts user for input
        System.out.print("What is your current age? ");
        //Stores current Age
        UserAge = sw.nextInt();
        //Prompts user for input
        System.out.print("At what age would you like to retire? ");
        //Stores Old Age
        OldAge = sw.nextInt();
        //Calculates years until retirement
        int YTR = OldAge-UserAge;

        //Calculates retirement year
        int RY = date + YTR;
        //Outputs when they can retire
        System.out.println("You have "+YTR +" years left until you can retire.");
        System.out.println("It's "+date+", so you can retire in "+RY+".");

    }

}
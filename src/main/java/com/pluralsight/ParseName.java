package com.pluralsight;

import java.util.Scanner;

public class ParseName {


    public static void main(String[] args) {

        //scanner import
        //sout Enter your name

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Your first name: ");
        String firstName = myScanner.nextLine();
        firstName = firstName.trim();

        System.out.println("Your middle name: ");
        String middleName = myScanner.nextLine();
        middleName = middleName.trim();

        System.out.println("Your last name: ");
        String lastName = myScanner.nextLine();
        lastName = lastName.trim();
        myScanner.close();


        System.out.println(firstName + " " + middleName + " " + lastName);



    }
}

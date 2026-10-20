package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner
        Scanner read = new Scanner(System.in);

        System.out.println("==== FULL NAME PARSER ====");
        System.out.print("Enter your full name: ");
        String fullName = read.nextLine();

        // Remove leading and trailing spaces
        fullName = fullName.trim();

        // Find the positions of the spaces
        int firstSpace = fullName.indexOf(" "); // Finds the first space of the string
        int lastSpace = fullName.lastIndexOf(" "); // Finds the last space of the string

        // Extract first, middle, and last names
        String firstName = fullName.substring(0, firstSpace); // Extracts everything from 0 to the first space
        String middleName = fullName.substring(firstSpace + 1, lastSpace); // Extracts everything from the index after the first until the last space is reached
        String lastName = fullName.substring(lastSpace + 1); // Extracts everything after the last space

        // Display results
        printInfo(firstName, middleName, lastName);
    }

    public static void printInfo(String firstName, String middleName, String lastName) {
        System.out.printf("First name: %s\nMiddle name: %s\nLast name: %s\n", firstName, middleName, lastName);
    }
}
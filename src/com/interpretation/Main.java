// Java program to print string in chars outlook from new line

package com.interpretation;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating new string
        String str = "I am String.";

        // Creating array of chars from created string
        char [] arr = str.toCharArray();

        // Printing chars to console
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}
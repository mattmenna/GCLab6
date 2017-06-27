package com.company;

/*
Prompt the user for a word
Translate the text to Pig Latin and display it on the console.
Ask the user if he or she wants to translate another word.

todo Does this need stringbuilder?

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Pig Latin Translator");
        char cont;

        do {
            System.out.println("Enter a line to be translated:");
            String input = scnr.nextLine();
            String lowerCaseinput = input.toLowerCase();
            System.out.println(lowerCaseinput);

            if (lowerCaseinput.substring(0, 1).matches("[aeiou]")) {
                System.out.println("Vowel in first letter");
                System.out.println(lowerCaseinput + "way");
            } else {
                System.out.println("Consonant");
            }

            scnr.nextLine(); // clears scanner so loop operates properly
            System.out.println("Do you want to continue? Please use y or n");
            cont = scnr.next().charAt(0);
            scnr.nextLine(); // clears scanner so loop operates properly

        } while (cont != 'n');

    } // end of main

} //end of class

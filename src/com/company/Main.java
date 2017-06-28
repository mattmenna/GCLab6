package com.company;

/*
Prompt the user for a word
Translate the text to Pig Latin and display it on the console.
Ask the user if he or she wants to translate another word.

todo I think this is a deadend and need to redevelop with methods that work on individual words. Currently only depeneds on first char.

Try split method first and then work on individual words

 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Pig Latin Translator");
        char cont;
        String[] output;
        String wordToCheck;
        do {
            System.out.println("Enter a line to be translated:");
            String input = scnr.nextLine().toLowerCase(); // space required for regex in split
            String[] pigInput = input.split(" ");

            StringBuilder consonant = new StringBuilder();

            System.out.println(input);

            for (int i = 0; i < pigInput.length; i++) {
                wordToCheck = pigInput[i];
                if (wordToCheck.substring(0,1).matches("[aeiou]")){
                    pigInput[i] = pigInput[i]+ "way";

                } else {
                    for (int j =0; j<wordToCheck.length(); j++) {
                        if (wordToCheck.substring(j, j + 1).matches("[bcdfghjklmnpqrstvwxyz]")) {
                            consonant.append(wordToCheck.substring(j, j + 1));
                            //consonant.deleteCharAt(j);
                        } else break;
                    }// end for
                pigInput[i] = consonant.toString();
                } // end else
                System.out.print(pigInput[i] + " ");
            } // end for

            scnr.nextLine(); // clears scanner so loop operates properly
            System.out.println("Do you want to continue? Please use y or n");
            cont = scnr.next().charAt(0);
            scnr.nextLine(); // clears scanner so loop operates properly

        } while (cont != 'n');

    } // end of main

} //end of class

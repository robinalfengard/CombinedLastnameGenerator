package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    public static void run(String firstName1, String firstName2, String lastName1, String lastName2, int nameSize){
        String lastName1ToLower = lastName1.toLowerCase();
        String lastName2ToLower = lastName2.toLowerCase();
        char[] testerToChar = lastName1ToLower.toCharArray();
        char[] demoToChar = lastName2ToLower.toCharArray();
        List<Character> listOfLetters = new ArrayList<>();

        for (char l : testerToChar) {
            listOfLetters.add(l);
        }

        for (char l : demoToChar) {
            listOfLetters.add(l);
        }

        // Randomize list
        Collections.shuffle(listOfLetters);
        char[] consonantsArray = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};


        // Loop which checks that consonants aren't followed by each other and that the previous letter is not the same as the current
        char previous = ' ';
        List<String> strings = new ArrayList<>();
        for (char l : listOfLetters){
            boolean isCurrentConsonant = false;
            for (char c : consonantsArray){
                if (l == c){
                    isCurrentConsonant = true;
                    break;
                }
            }
            boolean isPreviousConsonant = false;
            for (char c : consonantsArray){
                if (previous == c){
                    isPreviousConsonant = true;
                    break;
                }
            }
            if (isCurrentConsonant && isPreviousConsonant) {
                continue;
            }
            if (l == previous){
                continue;
            }
            previous = l;
            strings.add(String.valueOf(l));
        }

        // Edits
        String toString = String.join(",", strings);
        String edited = toString.replace(",", "");
        // Adjust the length of the name
        String limited = edited.substring(0, nameSize+1);
        // Edits of case size
        String result = limited.substring(0, 1).toUpperCase() + limited.substring(1, nameSize);
        System.out.println(firstName1 + " & " + firstName2 + " " + result);
    }
    // Get size of new lastname
    public static int getNameSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many characters do you want your new name to include?: ");
        return sc.nextInt();
    }
}

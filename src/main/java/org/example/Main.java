package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String lastname1 = "tester";
        String lastName2 = "demolastname";
        char[] testerToChar = lastname1.toCharArray();
        char[] demoToChar = lastName2.toCharArray();
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
        String limited = edited.substring(0, 6);
        String upperCase = limited.substring(0, 1).toUpperCase() + edited.substring(1,6);
        System.out.println("Demo & Tester " + upperCase);
    }
}
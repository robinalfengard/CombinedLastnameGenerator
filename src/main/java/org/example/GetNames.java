package org.example;

import java.util.Scanner;

public class GetNames {
    // Get names
    public static String getFirstFirstName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstname of one of you: ");
        return sc.nextLine();
    }
    public static String getSecondFirstName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the second firstname: ");
        return sc.nextLine();
    }
    public static String getFirstLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first lastname you would like to combine: ");
        return sc.nextLine();
    }
    public static String getSecondLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the second lastname you would like to combine: ");
        return sc.nextLine();
    }
}

package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int target;
        char choice;
        int [] numbers = {2, 3, 6, 8, 7, 9, 1, 10, 15, 19};
        System.out.println("Let me show you a magic trick : )\n");

        do {
            System.out.println("Enter the target: ");
            target = scn.nextInt();
            System.out.println(Arrays.toString(numbers));
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        System.out.println("The indices are: " + i + ", " + j);
                    } /*else {
                        System.out.println("No indices");
                    }*/
                }
            }
            System.out.println("Do you want to continue? (Y/y)");
            choice = scn.next().charAt(0);
        }while (choice == 'Y' || choice == 'y');
    }
}

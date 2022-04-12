/**
 * CPSC 220
 * Project 1 - Finding Factors
 * I pledge
 * Ian Grzebien
 * Write a program that asks the user for the lowest and highest number in a range of integers. For each number in
 * that range, print all of the factors of that number separated by spaces
 */
package edu.umw.project1;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        double number = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Factor Factory");
        System.out.print("Enter the lowest number in the range to be factored > ");
        int lowRange = input.nextInt();
        System.out.print("Enter the highest number in the range to be factored > ");
        int highRange = input.nextInt();
        System.out.println();

        while (lowRange <= highRange) {
            System.out.println(findFactors(lowRange));
            lowRange++;
        }
        System.out.println();
        System.out.println("Goodbye!");
    }

    public static String findFactors(int num) {
        int i = 1;
        String lowRange2 = num + ":";
        String factors = "";
        while (i <= num){
            if (num % i == 0){
                factors = factors + " " + (i);
            }
        i++;
        }
    return lowRange2 + factors;
    }


}

package tms.lesson2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int res = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            res *= i;
        }
        System.out.println("Factorial of " + number + " = " + res);
    }
}
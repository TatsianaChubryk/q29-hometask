package tms.lesson2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        float count = 0;
        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your grade: ");

            float grade = sc.nextFloat();

            count += grade;
            float averageGrade = count / i;
            int countGrade = 10 - i;

            System.out.println("Grade entered: " + i);
            System.out.println("Average arithmetic " + averageGrade);
            System.out.println("Grade left " + countGrade);
        }
    }
}
package tms.lesson4;

/*Есть числовой массив. Необходимо вывести информацию о его элементах
а) количество элементов
b) сумма элементов
с) максимальный элемент
d) минимальный элемент*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTaskTwo {
    public static void main(String[] args) {

        System.out.print("Enter the length of the arrays:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] randArray = new int[n];
        int sum = 0;
        int max = randArray[0];
        int min = randArray[0];

        for (int i = 0; i < n; ++i) {
            randArray[i] = new Random().nextInt(-10, 35);

            sum = sum + randArray[i];

            if (randArray[i] > max) {
                max = randArray[i];
            }

            if (randArray[i] < min) {
                min = randArray[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(randArray));
        System.out.println("Number of array elements: " + randArray.length);
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Max element of array: " + max);
        System.out.println("Min element of array: " + min);
    }
}
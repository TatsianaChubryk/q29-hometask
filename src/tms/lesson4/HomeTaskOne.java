package tms.lesson4;

/*Есть два числовых массива разной длинны (без дубликатов в рамках каждого массива).
Необходи вывести в терминал все элементы, которые встречаются в обоих массивах.*/

import java.util.Arrays;

public class HomeTaskOne {
    public static void main(String[] args) {

        int[] arrayOne = {5, 8, 16, 17, 33, 25};
        int[] arrayTwo = {8, 3, 6, 25, 13, 17, 9, 5, 1};
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));

        for (int i = 0; i < arrayOne.length; i++) {
            int duplicate = arrayOne[i];

            for (int j = 0; j < arrayTwo.length; j++) {

                if (duplicate == arrayTwo[j]) {
                    System.out.print(duplicate + " ");
                    break;
                }
            }
        }
    }
}
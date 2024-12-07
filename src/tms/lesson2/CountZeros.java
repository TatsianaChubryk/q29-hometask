package tms.lesson2;

public class CountZeros {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int num = i;

            while (num % 5 == 0) {
                count++;
                num /= 5;
            }
        }
        System.out.println(count);
    }
}
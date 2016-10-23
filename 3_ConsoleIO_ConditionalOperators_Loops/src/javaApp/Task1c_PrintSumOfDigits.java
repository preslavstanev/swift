package javaApp;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while (num >= 10) {
            sum += num % 10;
            num = num / 10;
        }
        sum += num;
        System.out.print(sum);
    }
}

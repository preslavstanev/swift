package javaApp;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write the number ");
        int num = input.nextInt();
        int reverse=0;
        while (num >= 10) {
            reverse = num % 10;
            num = num / 10;
            System.out.print(reverse);
        }
        System.out.print(num);
    }
}

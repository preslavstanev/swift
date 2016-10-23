package javaApp;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num >= 10) {
            num = num / 10;
        }
        System.out.print(num);
    }
}

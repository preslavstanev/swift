package javaApp;

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        int[] array = new int[numb];
        for (int i = 0; i < numb; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < numb; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
    }
}

package javaApp;

import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];
        int var = 0;
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            var += array[i];
        }
        System.out.print(var);
    }
}

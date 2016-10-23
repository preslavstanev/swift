package javaApp;

import java.util.Scanner;

public class Task3a_PrintSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("how many stars? ");
        int n = input.nextInt();
        String star = "*";
        String space = "  ";
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(star + " ");
                } else {
                    System.out.print(space);
                }
            }
        }
    }
}

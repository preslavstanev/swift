package javaApp;

import java.util.Scanner;

public class Task2b_PrintReversedSequens {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ennter the numers ");
        String numbers = input.nextLine();
        String[] revers = numbers.split("[ ]");
        for (int i = revers.length - 1; i >= 0; i--) {
            System.out.print(revers[i] + " ");
        }
    }
}

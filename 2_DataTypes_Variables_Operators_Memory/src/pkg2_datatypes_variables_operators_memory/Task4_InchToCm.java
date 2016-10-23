package javaapplications;

import java.util.Scanner;

public class Task4_InchToCm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write inches; ");
        int inches = input.nextInt();
        double inch = 2.54;
        double sum = inches * inch;
        System.out.print(inches + " inches is;" + sum + "cm");
    }
}

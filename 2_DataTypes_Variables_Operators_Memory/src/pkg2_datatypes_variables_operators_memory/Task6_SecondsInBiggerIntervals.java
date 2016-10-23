package javaapplications;

import java.util.Scanner;

public class Task6_SecondsInBiggerIntervals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLS Write the number");
        int seconds = input.nextInt();
        double hours;
        int day;
        int minute;
        minute = seconds / 60;
        seconds = seconds - minute * 60;
        hours = minute / 60;
        System.out.print("Дни" + hours + "Часа" + minute + "Минути");
    }
}

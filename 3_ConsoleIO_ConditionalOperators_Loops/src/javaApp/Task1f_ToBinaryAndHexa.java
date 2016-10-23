package javaApp;

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N=");
        int n = input.nextInt();
        toHex(n);
        toBinary(n);
    }

    public static void toHex(int n) {
        String hex = "";
        int rest;
        while (n > 0) {
            rest = n % 16;
            n /= 16;
            switch (rest) {
                case 10:
                    hex += "A";
                    break;
                case 11:
                    hex += "B";
                    break;
                case 12:
                    hex += "C";
                    break;
                case 13:
                    hex += "D";
                    break;
                case 14:
                    hex += "E";
                    break;
                case 15:
                    hex += "F";
                    break;
                default:
                    hex += Integer.toString(rest);
            }
        }
        String toHex = revers(hex);
        System.out.print(toHex);
        System.out.println();
    }

    public static String revers(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static void toBinary(int n) {
        String result = "";
        int rest;
        while (n > 0) {
            rest = n % 2;
            n /= 2;
            result = rest + result;
        }
        System.out.print(result);
    }
}

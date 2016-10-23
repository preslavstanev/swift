package javaapplications;

public class Task5_SwapVariables {

    public static void main(String[] args) {
        byte a = 5;
        byte b = 8;
        byte memory;
        memory = a;
        a = b;
        b = memory;
        System.out.print("a=" + a +", b=" + b);
    }
}

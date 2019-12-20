import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {

    static int gennemsnit(int a, int b) {
        return (a + b) / 2;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void start() {
        int endlessPain = 1;
        System.out.println("\n ***The Flexy Calculator***");
        do {
            System.out.println("\nType first number");
            Scanner a = new Scanner(System.in);
            int inputA = a.nextInt();
            System.out.println("\nType second number");
            Scanner b = new Scanner(System.in);
            int inputB = b.nextInt();

            System.out.println("\nSum of " + inputA + " + " + inputB + ": " + sum(inputA, inputB));
            System.out.println("Average of " + inputA + " and " + inputB + ": " + gennemsnit(inputA, inputB));
        } while (endlessPain == 1);
    }

    public static void main(String[] args) {
        start();
    }
}

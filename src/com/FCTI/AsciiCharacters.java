package com.FCTI;

public class AsciiCharacters {
    public static void printNumbers () {
        System.out.println("Valid numbers: ");
        for (int i = 48; i < 58; i++) {
            System.out.printf("%c, ", i);
        }
        System.out.println();
    }

    public static void printLowerCase() {
        System.out.println("Valid lowercase: ");
        for (int j = 97; j < 123; j++) {
            System.out.printf("%c, ", j);
        }
        System.out.println();
    }

    public static void printUpperCase() {
        System.out.println("Valid UpperCase: ");
        for (int k = 65; k < 91; k++) {
            System.out.printf("%c, ", k);
        }
        System.out.println();
    }
}

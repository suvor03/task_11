package ru.vsu.cs.suvorov_d_a;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        printRepresentationResultA(readRoman());
        printRepresentationResultB(readArabic());
    }

    private static String readRoman() {
        System.out.println("Write a Roman numeral: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int readArabic() {
        System.out.println("Write an Arabic numeral: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printRepresentationResultA(String str) {
        System.out.println("The equivalent form of number = "+ NumberRepresentation.romanToArabic(str));
    }

    private static void printRepresentationResultB(int value) {
        System.out.println("The equivalent form of number = "+ NumberRepresentation.arabicToRoman(value));
    }
}
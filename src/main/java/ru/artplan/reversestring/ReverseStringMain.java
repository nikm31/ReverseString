package ru.artplan.reversestring;

import java.util.Scanner;

public class ReverseStringMain {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            reverseString(word);
        }

        long totalMs = System.currentTimeMillis() - start;

        String sb = reverseString(word) + "\nВремя 1 000 итераций: " + totalMs / 100 + " ms" +
                "\nВремя 10 000 итераций: " + totalMs / 10 + " ms" +
                "\nВремя 100 000 итераций: " + totalMs + " ms";

        System.out.println(sb);
    }

    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
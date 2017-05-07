package week2.codingbat_string1;

/**
 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

 makeAbba("Hi", "Bye") → "HiByeByeHi"
 makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 makeAbba("What", "Up") → "WhatUpUpWhat"
 */
public class MakeAbba {
    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));

    }

    public static String makeAbba(String a, String b) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(a);
        stringBuilder1.append(b);
        stringBuilder1.append(b);
        stringBuilder1.append(a);
        return stringBuilder1.toString();
    }
}

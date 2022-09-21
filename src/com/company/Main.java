package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        String word = "DIX";
        System.out.println(romanToInt(word));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> numerals = new HashMap<>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int num1 = numerals.get(ch);

            if (i + 1 < s.length()) {
                int num2 = numerals.get(s.charAt(i + 1));

                if (num1 >= num2) {
                    result += num1;
                } else {
                    result += num2 - num1;
                    i++;
                }
            } else {
                result += num1;
            }
        }
        return result;
    }
}
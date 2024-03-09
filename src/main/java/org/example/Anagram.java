package org.example;

import java.util.Arrays;

public class Anagram {

    public String handler(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return str1 + " and " + str2 + " are not anagrams.";
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            return str1 + " and " + str2 + " are anagrams.";
        } else {
            return str1 + " and " + str2 + " are not anagrams.";
        }
    }
}
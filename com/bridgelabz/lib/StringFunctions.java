/***************************************************************************
* Purpose : To create string methods
*
* @author   Sujit
* @version  1.0
* @since    18-08-2017
****************************************************************************/
//package com.bridgelabz.lib;

import java.util.Arrays;
public class StringFunctions {

    public static boolean isAnagram(String str1, String str2) {
        boolean isAnagram = true;
        char arr1[] = str1.toLowerCase().toCharArray();
        char arr2[] = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    isAnagram = true;
                } else {
                    isAnagram = false;
                    break;
                }

            }
        }
        return isAnagram;
    }

    public static boolean isPalindrome(String str) {
        char arr[] = str.toLowerCase().toCharArray();
        boolean isPalindrome = true;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++, j--) {
            if (arr[i] == arr[j]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                return isPalindrome;
            }
        }
        return isPalindrome;

    }
}
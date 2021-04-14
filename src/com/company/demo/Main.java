package com.company.demo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* Question 1
         * 1. Write a program to accept a word as array of characters and output as given in the
            example below. Assume the given word will be of odd length.
             Marks : 5
             Example:
             Input:
             PROGRAM

             Output :
             P M
             R A
             O R
             G
             O R
             R A
             P M

             Input : ODD
             Output :
             O D
             D
             O D

        * */

        Question1.printPattern("PROGRAM");


        /*
        * Question 2
        * 2. Given two sorted integer arrays, create a third array that contains the sorted union of the
            two arrays.
            Marks: 7
            * The created array should also be in sorted order.
            * Duplicate entries should not be there.
            * You should use only one loop
            * You should not use sorting
            * Please write efficient code.
            * Note: The two arrays are already sorted.
            Example:
             First Array - [ 4,5,9,13,15,17]
             Second Array - [ 4,8,9,11,16,17]
             Merged Array - [ 4,5,8,9,11,13,15,16,17]
        * */


        int[] firstArray = {4,5,9,13,15,17};
        int[] secondArray = {4,8,9,11,16,17};


        Question2 question2 = new Question2();
        question2.unionArray(firstArray,secondArray);
        question2.unionArrayWithTreeSet(firstArray,secondArray);



        /*
        * Question 3
        * 3. Given two strings of the same length. Compare the strings and print all pairs of
        *    substrings that do not match with each other.
        *    Marks: 6
        *    Example:
        *    Input:
        *    1. abcddefgikom
        *    2. abdcdeffgklm
        *    Output:
        *    cd,dc
        *    gi,fg
        *     o,l
        * */


        String s1 = "abcddefgikom";
        String s2 = "abdcdeffgklm";

        Question3.printNotMatchedPairs(s1,s2);



        /*
        * Question 4
        * 4. Given a numeric array containing only positive numbers, print the number of times
            each number is duplicated.
             * Hint: You can change the contents of the array during your calculation.
             * Don't use another array.
            Marks: 7
             Example:
             Input: [2,3,6,2,2,1,6]
            Output:
             2 - 3
             3 - 1
             6 - 2
             1 – 1
        * */


        int[] arr = {2,3,6,2,2,1,6};
        Question4.frequencyOfNumbersInArray(arr);


        /*
        * Question 5
        * 5 . Remove the words that are palindromes in a sentence.
        *    • A palindrome is a word that can be read the same way in either direction. Eg: deed ,
        *    did , malayalam etc
        *    •Assume the input sentence as array of characters
        *    •Don't try to print it. The contents of the array should be changed.
        *    •Don't use another array.
        *    •Don't use any inbuilt functions.
        * */

        // As Per Question the given String is taken as array of characters
        char[] s = {'h','e',' ','d','i','d',' ','a',' ','g','o','o','d',' ','d','e','e','d'};

        char[] t = "Nair speaks malayalam".toCharArray();
        Question5.removePalindrome(s);
        System.out.println();
        Question5.removePalindrome(t);

    }


}

package com.company.demo;

import java.util.Arrays;

public class Question5 {

    public static void removePalindrome(char[] words)
    {
        for (int i = 0; i < words.length; i++) {
            int start = i;
            while (i< words.length && words[i]!=' ')
            {
                i++;
            }
            int end = i;
            if(checkWords(words,start,end-1))
            {
                while (start<end)
                {
                    words[start]=' ';
                    start++;
                }
            }
        }
        printWords(words);
    }

    public static boolean checkWords(char[] arr, int start, int end)
    {
        if (start==end)
        {
            return true;
        }
        else if(arr[start]!=arr[end])
        {
            return false;
        }
        else if(start<end)
        {
           return checkWords(arr, start+1, end-1);
        }
        return true;
    }

    private static void printWords(char[] palindromesRemoved)
    {
        boolean flag =false;
        for (int i = 0; i < palindromesRemoved.length; i++) {
            if(palindromesRemoved[i]==' ')
            {
                flag=true;
            }
            else
            {
                if(flag)
                {
                    System.out.print(" ");
                }
                flag =false;
                System.out.print(palindromesRemoved[i]);
            }
        }
    }



}

package com.company.demo;

public class Question3 {


    public static void printNotMatchedPairs(String s1, String s2)
    {
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(s1.charAt(i+1)!= s2.charAt(i+1))
                {
                    System.out.println(s1.charAt(i)+""+s1.charAt(i+1)+","+s2.charAt(i)+""+s2.charAt(i+1));
                    i++;
                }
                else {
                    System.out.println(s1.charAt(i)+","+s2.charAt(i));
                }
            }
        }
    }
}

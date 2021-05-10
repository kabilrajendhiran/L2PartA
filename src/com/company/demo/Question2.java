package com.company.demo;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Question2 {


    //Given Question: Using Array
    public void unionArray(int[] firstArray, int[] secondArray)
    {
        int f = firstArray.length;
        int l = secondArray.length;
        int n = f+l;
        int[] unionArray = new int[n];
        int a=0,b=0;

        for (int i = 0; i < n; i++) {
            if(a<f&&b<l)
            {
                if(firstArray[a]>secondArray[b])
                {
                    unionArray[i] = secondArray[b];
                    b++;
                }
                else if(firstArray[a]<secondArray[b])
                {
                    unionArray[i] = firstArray[a];
                    a++;
                }
                else if(firstArray[a]==secondArray[b])
                {
                    unionArray[i] = firstArray[a];
                    a++;
                    b++;
                }
            }
            else if(a==f && b==l)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(unionArray));
    }


    // Another Method using tree set
    public void unionArrayWithTreeSet(int[] firstArray, int[] secondArray)
    {
        Set<Integer> set = new TreeSet();
        for (int i = 0; i < firstArray.length; i++) {
            set.add(firstArray[i]);
            set.add(secondArray[i]);
        }

        for (int i: set) {
            System.out.print(i+ " ");
        }
    }



}

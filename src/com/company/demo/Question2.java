package com.company.demo;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Question2 {
    int[] firstArray = {4,5,9,13,15,17};
    int[] secondArray = {4,8,9,11,16,17};
    int[] unionArray = new int[firstArray.length+secondArray.length];


    //Given Question: Using Array
    public void unionArray()
    {
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i]==secondArray[i])
            {
                unionArray[count++] = firstArray[i];
            }
            else if(firstArray[i]>secondArray[i])
            {
                unionArray[count++]= secondArray[i];
                unionArray[count++] = firstArray[i];

            }
            else if(firstArray[i]<secondArray[i])
            {
                unionArray[count++]= firstArray[i];
                unionArray[count++] = secondArray[i];

            }
        }

        System.out.println(Arrays.toString(unionArray));
    }


    // Another Method using tree set
    public void unionArrayWithTreeSet()
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

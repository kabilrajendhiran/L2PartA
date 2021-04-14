package com.company.demo;

public class Question4 {
    public static void frequencyOfNumbersInArray(int[] arr)
    {
        sortArr(arr);
        for (int i = 0; i < arr.length-1; i++) {
            int count = 1;
            while (i< arr.length-1 && arr[i]==arr[i+1])
            {
                i++;
                count++;
            }

            System.out.println(arr[i]+"->"+count);
        }
    }

    private static void sortArr(int[] a)
    {
        for (int i = 1; i < a.length; i++) {
            int j=i-1;
            int k = a[i];

            while (j>=0 && a[j]>k )
            {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = k;
        }

    }

}

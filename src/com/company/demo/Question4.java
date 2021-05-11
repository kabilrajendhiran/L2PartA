package com.company.demo;

public class Question4 {
  /*  public static void frequencyOfNumbersInArray(int[] arr)
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
*/

    public static void frequencyOfNumbersInArray(int[] arr)
    {
        int value = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = i+1;
            while (x< arr.length && arr[i]!=arr[x])
            {
                x++;
            }
            if(x< arr.length)
            {
                if(value==arr[x])
                {
                    count++;
                }
                else if(value!=arr[x])
                {
                    /*System.out.println(value+" : "+count);*/
                    value =arr[i];
                    count=1;
                }
                swap(i+1,x,arr);
                /*System.out.println(i+" "+" "+x);*/
            }
            else if(i!= arr.length-1)
            {
                if(value==arr[i])
                {
                    count++;
                }
                else {
                    count=1;
                }
                System.out.println(arr[i]+" : "+count);
            }
            else {
                System.out.println(arr[i]+" : "+count);
            }

        }
    }

    public static void swap(int i,int j,int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

package com.company.demo;

public class Main {

    public static void main(String[] args) {
	    String s = "PROGRAM";
	    int length = s.length();
	    int space_length = length/2;

        for (int i = 0; i < length/2; i++) {
            printSpace(i);
            System.out.print(s.charAt(i));
            printSpace(2*(space_length-i)-1);
            System.out.print(s.charAt(length-1-i));
            System.out.println("");
        }
        printSpace(space_length);
        System.out.println(s.charAt(space_length));

        for (int i = 0; i < length/2; i++) {
            printSpace(space_length-i-1);
            System.out.print(s.charAt(space_length - i-1));
            printSpace((i*2)+1);
            System.out.print(s.charAt(space_length+i+1));
            System.out.println("");
        }
        
    }

    public static void printSpace(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
}

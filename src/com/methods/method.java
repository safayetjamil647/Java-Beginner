package com.methods;

public class method {
    public static void main(String[] args) {
        printAverage(20,30);
        double average= getAverage(30,30);
        System.out.println("average"+average);

    }

    public static void printAverage(int val1, int val2) {
        double average=(val1+val2)/2.0;
        System.out.println("average"+average);

    }

    public static double getAverage(int val1, int val2) {
        double average=(val1+val2)/2.0;

        return average;

    }
}

package com.example;
import java.util.Scanner;


public class inputLearn {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        Scanner kb= new Scanner(System.in);
        System.out.println("please inter num");
        firstNum=kb.nextInt();

        System.out.println("please inter num");
        secondNum=kb.nextInt();

        double average;
        average=(firstNum+secondNum)/2.0;
        System.out.println("average:"+average);

        String firstName;
        String secondName;
        kb.nextLine();
        System.out.println("please inter name");
        firstName=kb.nextLine();

        System.out.println("please inter name");
        secondName=kb.nextLine();

        System.out.println(firstName+secondName);

    }
}

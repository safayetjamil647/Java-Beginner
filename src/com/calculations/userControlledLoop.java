package com.calculations;

import javax.swing.*;

public class userControlledLoop {
    public static void main(String[] args) {
        int maxValue;
        String input= JOptionPane.showInputDialog("how high sqare");
        maxValue=Integer.parseInt(input);
        System.out.println("Number              Number squared");
        System.out.println("==================================");
        for(int number=1; number<=maxValue;number++)
        {
            System.out.println(number+"\t\t\t\t\t\t"+number*number);
        }
    }
}

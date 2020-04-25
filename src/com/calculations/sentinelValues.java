package com.calculations;

import javax.swing.*;

public class sentinelValues {
    public static void main(String[] args) {
        int value;
        int doubleValue;
        String input= JOptionPane.showInputDialog("enter a value to double"+"(0to stop)");

        value= Integer.parseInt(input);

        while(value != 0)
        {
            doubleValue=value*2;
            JOptionPane.showMessageDialog(null,""+value+"doubled"+doubleValue);

             input= JOptionPane.showInputDialog("enter a value to double"+"(0to stop)");

            value= Integer.parseInt(input);

        }
        System.exit(0);
    }
}

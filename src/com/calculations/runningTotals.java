package com.calculations;

import javax.swing.*;

public class runningTotals {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales=0.0;//total run
        String input = JOptionPane.showInputDialog("for how many days do you have sales"+"figures");
        days = Integer.parseInt(input);
        for(int count=1;count<=days;count++)
        {
            input=JOptionPane.showInputDialog("enter the sales of the day"+ count);
            sales=Double.parseDouble(input);
            totalSales+=sales;
        }
        JOptionPane.showMessageDialog(null,"total sales is"+totalSales);
        System.exit(0);
    }

}

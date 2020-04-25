package com.calculations;

import javax.swing.*;
import java.text.DecimalFormat;

public class runningTotals {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales=0.0;//total run
        DecimalFormat dollar=new DecimalFormat("##0.00");
        String input = JOptionPane.showInputDialog("for how many days do you have sales"+"figures");
        days = Integer.parseInt(input);
        for(int count=1;count<=days;count++)
        {
            input=JOptionPane.showInputDialog("enter the sales of the day"+ count);
            sales=Double.parseDouble(input);
            totalSales+=sales;
        }
        JOptionPane.showMessageDialog(null,"total sales is"+dollar.format(totalSales));
        System.exit(0);
    }

}

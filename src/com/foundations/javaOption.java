package com.foundations;

import javax.swing.*;

public class javaOption {
    public static void main(String[] args) {
        String name;
        String surname;
        name= JOptionPane.showInputDialog("please inter name");
        surname=JOptionPane.showInputDialog("please inter surname");
        JOptionPane.showMessageDialog(null,name+""+surname);
        int firstNum;
        int secondNum;
        String input;

        input= JOptionPane.showInputDialog("please inter firstnumber");
        firstNum=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("please inter secondnumer");
        secondNum=Integer.parseInt(input);
        double average = (firstNum+secondNum)/2.0;
        JOptionPane.showMessageDialog(null,average);

    }
}

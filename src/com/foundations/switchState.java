package com.foundations;

import javax.swing.*;

public class switchState {
    public static void main(String[] args) {
        int number;
        String input = JOptionPane.showInputDialog("Please enter 1,2,3");
        number= Integer.parseInt(input);
        switch(number)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"you entered 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"you entered 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"you entered 3");
                break;
            default:

                JOptionPane.showMessageDialog(null,"you not entered 1,2,3");
        }
        char letter;
        input=JOptionPane.showInputDialog("pLEASE enter a b c");
        letter= input.charAt(0);
        switch (letter)
        {
            case 'A':
            case 'a':
            JOptionPane.showMessageDialog(null,"inputed a");
                break;
            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null,"inputed b");
                break;
            case 'C':
            case 'c':
                JOptionPane.showMessageDialog(null,"inputed c");
                break;
            default:
                JOptionPane.showMessageDialog(null,"not cooresct");
        }
        System.exit(0);
    }
}

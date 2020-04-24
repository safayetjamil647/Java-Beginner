package com.calculations;

import javax.swing.*;

public class inputValidation {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter number 1 to 100");
        int number=Integer.parseInt(input);
        while (number<1 || number >100)
        {
            JOptionPane.showMessageDialog(null,"not valid no");
            input=JOptionPane.showInputDialog("enter number 1 to 100");
            number=Integer.parseInt(input);

        }
        JOptionPane.showMessageDialog(null,"correct");
    }
}

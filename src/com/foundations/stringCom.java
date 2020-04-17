package com.foundations;

import javax.swing.*;

public class stringCom {
    public static void main(String[] args) {
        String name1= JOptionPane.showInputDialog("please enter name");
        String name2= JOptionPane.showInputDialog("please enter name2");
        if (name1.compareTo(name2)==0)
        {
            System.out.println("name is same");
        }if(name1.compareTo(name2)<0){
            System.out.println("name 1 first name 2 second");
        }if(name1.compareTo(name2)>0) {
            System.out.println("name 1 first name 2 second");
        }

    }
}

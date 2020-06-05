package com.textfile;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class readingFile {
    public static void main(String[] args)throws IOException {
        File file=new File("OutputFile.txt");
        if(file.exists())
        {
            Scanner inputFile= new Scanner(file);
           while(inputFile.hasNext())
           {
               System.out.println(inputFile.nextLine());
           }
            inputFile.close();
        }else{
            JOptionPane.showMessageDialog(null,"File doesnt "+"exist");
        }
    }
}

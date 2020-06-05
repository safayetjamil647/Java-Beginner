package com.textfile;

import java.io.IOException;
import java.io.PrintWriter;

public class writingFile {
    public static void main(String[] args)throws IOException {
        PrintWriter outputFile=new PrintWriter("OutputFile.txt");
        outputFile.println("this is line one");
        outputFile.println("this is line tone");
        outputFile.println("this is line throne");
        outputFile.close();
    }
}

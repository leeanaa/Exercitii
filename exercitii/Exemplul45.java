//45.Write a Java program to find the size of a specified file

import java.io.*;
public class Exemplul45{
    public static void main(String [] args){
        File f = new File("./Exemplul37.java");
        System.out.println(f.length());
    }
}
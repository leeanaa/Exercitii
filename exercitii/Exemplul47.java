//Write a Java program to display the current date time in specific format.
//Now: 2017/06/16 08:52:03.066

import java.time.*;
public class Exemplul47{
    public static void main (String [] args){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
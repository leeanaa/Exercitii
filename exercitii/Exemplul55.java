//55.Write a Java program to convert seconds to hour, minute and seconds. 
import java.util.Scanner;
public class Exemplul55{
    public static void main(String [] args){
       Scanner scanner = new Scanner(System.in);
       int nr = scanner.nextInt();
       int h = 0;
       int m = 0;
       int s = 0;
       if (nr>=60){
           m = nr/60;
           s = nr%60;
           if(m>=60){
               h = m/60;
               m = m%60;
           }
       }else{
           s = nr;
       }
       System.out.println(h+": "+m+": "+s);
    }
}
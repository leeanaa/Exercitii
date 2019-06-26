//program to accept a number and check the number is even or not. 
//Prints 1 if the number is even(par) or 0 if the number is odd
import java.io.*;
public class Exemplul49{
    public static void main(String [] args){
       
        System.out.println("Introduceti numarul");
        try( InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);) {
            String s = br.readLine();
            int n = Integer.parseInt(s);
            if (n%2==0){
                System.out.println("1");
            }else {
                System.out.println("0");
            }
        }catch(IOException e){
            e.printStackTrace();
        }       
    }
}
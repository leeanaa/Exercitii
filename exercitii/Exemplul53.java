//Write a Java program that accepts three integers from the user
// and return true if the second number is greater than first number and third number is greater than second number. 
//If "abc" is true second number does not need to be greater than first number. 
import java.util.Scanner;
public class Exemplul53{
    public static void main(String [] args){
        System.out.println("introduceti numerele");
        Scanner s1 = new Scanner(System.in);
        int x1 = s1.nextInt();
        System.out.println("primul numar este "+x1);
        Scanner s2 = new Scanner(System.in);
        int x2 = s2.nextInt();
        System.out.println("al doilea numar este "+x2);
        Scanner s3 = new Scanner(System.in);
        int x3 = s3.nextInt();
        System.out.println("al treilea numar este "+x3);
        if ((x2>x1)&&(x3>x2)){
            System.out.println("true");
        }
    }
}
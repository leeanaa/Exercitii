//program that accepts three integers from the user and return true if two or more of them (integers ) 
//have the same rightmost digit. The integers are non-negative.
import java.util.Scanner;
public class Exemplul54{
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
        if ((x1%10 == x2%10)||(x1%10 == x3%10)||(x2%10 == x3%10)){
            System.out.println("true");
        }
    }
}
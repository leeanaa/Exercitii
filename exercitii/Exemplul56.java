//56.program to find the number of integers within the range of two specified numbers and that are divisible by another number
import java.util.Scanner;
public class Exemplul56{
    public static void main(String [] args){
        System.out.println("introduceti primul numar");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        System.out.println("introduceti al doilea numar");
        Scanner s2 = new Scanner(System.in);
        int b = s2.nextInt();
        System.out.println("introduceti al treilea numar");
        Scanner s3 = new Scanner(System.in);
        int c = s3.nextInt();
        for(int i=a;i<=b;i++){
            if (i%c==0){
                System.out.println(i);
            }
        }
    }
}
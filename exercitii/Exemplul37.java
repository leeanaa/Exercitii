//revers a string
import java.util.Scanner;
public class Exemplul37{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("introduceti cuvantul");
        char [] cuv = scanner.nextLine().toCharArray();
        for (int i = cuv.length-1;i>=0;i--){
            System.out.print(cuv[i]);
        }
    }
}
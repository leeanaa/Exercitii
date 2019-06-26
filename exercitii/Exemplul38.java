//count the letters, spaces, numbers and other characters 
//of an input string  
import java.util.Scanner;
public class Exemplul38{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti sirul de caractere");
        char [] c = scanner.nextLine().toCharArray();
        int l = 0;
        int s = 0;
        int n = 0;
        int o = 0;
        for (int i=0;i<c.length;i++){
            if (((c[i]>='\u0061')&&(c[i]<='\u007A'))||
                 ((c[i]>='\u0041')&&(c[i]<='\u005A'))){
                l++;
            }else
            if((c[i]>='\u0030')&&(c[i]<='\u0039')){
                n++;
            }else
            if(c[i]=='\u0020'){
                s++;
            }else 
                o++;
            
        }
        System.out.println(l);
            System.out.println(s);
            System.out.println(n);
            System.out.println(o);
    }
}
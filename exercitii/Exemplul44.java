//accepts an integer (n) and computes the value of n+nn+nnn
import java.io.*;
public class Exemplul44{
    public static void main(String [] args){
         
         try (InputStreamReader isr = new InputStreamReader(System.in);
              BufferedReader br = new BufferedReader(isr);){
             String s = br.readLine();
             int n = Integer.parseInt(s);
             int suma=0;
             int exSuma=0;
             int c=1;
             for (int i =1; i<=3 ; i++){
                 exSuma = exSuma+c*n;
                 c=c*10; 
                 suma= suma+exSuma;
             }
             System.out.println(suma);
         }catch(IOException e){
             e.printStackTrace();
         }
    }
}
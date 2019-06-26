//60.Write a Java program to find the penultimate (next to last) word of a sentence. 
import java.io.*;
public class Exemplul60{
    public static void main(String [] args){
        System.out.println("Introduceti fraza");
        try( InputStreamReader isr =new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            ){
            String s = br.readLine();
            char [] cArray = s.toCharArray();
            int val =0;
            int a=0;
            int b=0;
            for (int i = cArray.length-1 ; i>=0;i--){
                while(val<=2){
                    if ((cArray[i]=='\u0020')&&(b!=0)){
                        b=i;
                        val++;
                    }
                    if ((cArray[i]=='\u0020')&&(a!=0)){
                        a=i;
                        val++;
                    }
                }
            }
            String cuv = String.valueOf(cArray, a, (b-a));
            System.out.println(cuv);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
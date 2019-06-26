//59.Write a Java program to convert a given string into lowercase.
import java.io.*;
public class Exemplul59{
    public static void main(String [] args){
        System.out.println("Introduceti cuvantul");
        try( InputStreamReader isr =new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            ){
            String s = br.readLine();
            char [] c = s.toCharArray();
            for (int i = 0 ; i<c.length;i++){
                if((c[i]>='\u0041')&&(c[i]<='\u005A')){
                    c[i]+='\u0020';
                }
            }
            System.out.println(String.valueOf(c));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
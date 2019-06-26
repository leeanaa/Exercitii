//58.Write a Java program to capitalize the first letter of each word in a sentence.

import java.io.*;
public class Exemplul58{
    public static void main(String [] args){
        System.out.println("Introduceti fraza");
        
        try(InputStreamReader isr = new InputStreamReader (System.in);
            BufferedReader br = new BufferedReader(isr);){
            String s = br.readLine();
            char [] c = s.toCharArray();
            for(int i = 0; i<c.length;i++){
                if((c[0]>'\u0061')&&(c[0]<'\u007A')){
                    c[0]-='\u0020';
                }
                if (c[i]=='\u0020'){
                    c[i+1] -= '\u0020';
                }
            }
            String result = String.valueOf(c);
            System.out.println(result);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
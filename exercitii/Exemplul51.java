//51.convert a string to an integer
import java.io.*;
public class Exemplul51{
    public static void main(String [] args){
        
        try (InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);){
            String s = br.readLine();
            int n = Integer.parseInt(s);
            System.out.println("numarul este "+n);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
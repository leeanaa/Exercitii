//52.calculate the sum of two integers and return true if the sum is equal to a third integer
import java.io.*;
public class Exemplul52{
    public static void main(String [] args){        
        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);){
            String s = br.readLine();
            String [] arrayString = s.split(" ");
            int [] arrayInt = new int[3];
            for (int i =0 ;i<3; i++ ){
                arrayInt[i]=Integer.parseInt(arrayString[i]);
            }
            if((arrayInt[0]+arrayInt[1]==arrayInt[2])||
               (arrayInt[0]+arrayInt[2]==arrayInt[1])||
               (arrayInt[1]+arrayInt[2]==arrayInt[0])){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
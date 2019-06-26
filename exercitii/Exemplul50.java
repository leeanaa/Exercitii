;//print numbers between 1 to 100 which are divisible by 3, 5 and by both
public class Exemplul50{
    public static void main(String [] args){
        int [] a = new int [100];
        int [] b = new int [100];
        int [] c = new int [100];
        for (int i =0; i<100;i++){
            if(i%3==0){
                a [i]=i;
            }
            
            if (i%5==0){
                b [i]=i;
            } 
            
            if ((i%3==0)&&(i%5==0)){
                c [i]=i;
            }
            
            
        }
        for (int x : a){
                if (x!=0){System.out.print(x+" ");}
        }
        System.out.println();
        for (int x : b){
                if (x!=0){System.out.print(x+" ");}
        }
        System.out.println();
        for (int x : c){
                if (x!=0){System.out.print(x+" ");}
        }
    }
}
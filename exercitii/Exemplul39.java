//create and display unique three-digit number using 1, 2, 3, 4. 
public class Exemplul39{
    public static void main(String [] args){
        int n = 0;
        for(int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if((i!=j)&&(i!=k)&&(j!=k)){
                        System.out.println(i+""+j+""+k);
                        n++;                   
                    }
                }
            }
        }
        System.out.println(n);
    }
}
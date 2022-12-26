import java.util.Random;
import java.util.Scanner;
public class rand2 {
    public static void main(String[] args){
        Random r = new Random();
        
        Scanner a = new Scanner(System.in);
        System.out.print("enter limit: ");
        int a1 = a.nextInt();
        for(int i=0;i<10;i++){
            
            System.out.println(r.nextInt(a1));
        }
    }
}    

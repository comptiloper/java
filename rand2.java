import java.util.Random;
import java.util.Scanner;
public class rand2 {
    public static void main(String[] args){
        Random r = new Random(); 
        //r is an object created to Random class module
        Scanner a = new Scanner(System.in);
        //object for Scanner class is created
        System.out.print("enter limit: ");
        int a1 = a.nextInt();
        //a1 is the field declared by scanner object
        for(int i=0;i<10;i++){
            
            System.out.println(r.nextInt(a1));
            //here a1 sets as max value 
        }
    }
}    

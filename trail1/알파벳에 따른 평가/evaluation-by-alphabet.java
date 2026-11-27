import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        char z; 
        z = sc.next().charAt(0);

        if(z == 'S') 
            System.out.println("Superior");
        
        else if(z == 'A') 
            System.out.println("Excellent");
        
         else if(z == 'B') 
            System.out.println("Good");
        
         else if(z == 'C') 
            System.out.println("Usually");
        
        else if(z == 'D') 
            System.out.println("Effort");
        
        else 
            System.out.println("Failure");
        }
}

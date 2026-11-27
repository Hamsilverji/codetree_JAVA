import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String z = sc. next();

        if ( z.equals("S")) {
            System.out.println("Superior");
        }
        else if ( z.equals ("A")) {
            System.out.println("Excellent");
        }
         else if  (z.equals ("B")) {
            System.out.println("Good");
        }
         else if ( z.equals ("C")) {
            System.out.println("Usually");
        }
          else if ( z.equals( "D")) {
            System.out.println("Effort");
        }
          else 
            System.out.println("Failure");
        }
}

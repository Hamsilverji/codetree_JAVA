import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int N2 = 80 - N;

        if (N >= 80) {
            System.out.println("pass");
        }
        else {
            System.out.println(N2 + " more score");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp;
        int temp2;
        int temp3;


        temp = a;
        temp2 = c;
        temp3 = b;

        b = temp;
        a = temp2;
        c = temp3;
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
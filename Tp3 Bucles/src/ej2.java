
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       
        int n = s.nextInt();

        for (int a = 1; a <= n; a++) {
            System.out.println(a);
        }

        int b = 1;
        while (b <= n) {
            System.out.println(b);
            b++;
        }

        int c = 1;
        if (n >= 1) {
            do {
                System.out.println(c);
                c++;
            } while (c <= n);
        }
    }
}
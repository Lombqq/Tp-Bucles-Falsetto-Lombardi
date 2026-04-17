import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("introduce el valor de n:");
        int n = s.nextInt();

        // usando un bucle for para ir hacia atras
        for (int a = n; a >= 1; a--) {
            System.out.println(a);
        }

        // usando un bucle while
        int b = n;
        while (b >= 1) {
            System.out.println(b);
            b--;
        }

        // usando un bucle do-while
        int c = n;
        if (n >= 1) {
            do {
                System.out.println(c);
                c--;
            } while (c >= 1);
        }
    }
}
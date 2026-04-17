import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m;

        do {
            System.out.println("introduce n (positivo):");
            n = s.nextInt();
            System.out.println("introduce m (positivo y mayor que n):");
            m = s.nextInt();

            if (n <= 0 || m <= 0 || n >= m) {
                System.out.println("valores no validos. intenta de nuevo.");
            }
        } while (n <= 0 || m <= 0 || n >= m);

        for (int a = 1; a <= m; a++) {
            if (a % n == 0) {
                System.out.println(a);
            }
        }
    }
}
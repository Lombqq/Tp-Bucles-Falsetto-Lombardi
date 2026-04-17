import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        do {
            System.out.println("introduce el numero a (debe ser menor):");
            a = s.nextInt();
            System.out.println("introduce el numero b:");
            b = s.nextInt();

            if (a >= b) {
                System.out.println("error: a debe ser menor que b. intenta de nuevo.");
            }
        } while (a >= b);

        for (int c = a; c <= b; c++) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }
    }
}
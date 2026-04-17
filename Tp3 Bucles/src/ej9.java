import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double a; 
        int b;
        double c = 1.0;

        System.out.println("introduce la base (numero real):");
        a = s.nextDouble();

        do {
            System.out.println("introduce el exponente (entero positivo):");
            b = s.nextInt();
            if (b < 0) {
                System.out.println("error: el exponente debe ser positivo");
            }
        } while (b < 0);

        for (int i = 1; i <= b; i++) {
            c = c * a;
        }

        System.out.println(c);
    }
}
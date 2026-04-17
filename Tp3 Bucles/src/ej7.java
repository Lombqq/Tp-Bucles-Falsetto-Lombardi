import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a; // millas
        double b; // kilometros

        do {
            System.out.println("introduce millas (0 para salir):");
            a = s.nextDouble();

            if (a != 0) {
                b = a * 1.6093;
                System.out.println(b);
            }

        } while (a != 0);
    }
}
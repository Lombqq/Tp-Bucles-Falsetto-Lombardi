
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a;

        do {
            System.out.println("introduce un caracter (0 para salir):");
            a = s.next().charAt(0);

            if (a != '0') {
                if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                    System.out.println("vocal");
                } else {
                    System.out.println("no vocal");
                }
            }

        } while (a != '0');
    }
}
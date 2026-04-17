import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        do {
            System.out.println("introduce el primer numero:");
            a = s.nextInt();
            System.out.println("introduce el segundo numero:");
            b = s.nextInt();

            if (a == b) {
                System.out.println("los numeros son iguales, introduce numeros distintos");
            }
        } while (a == b);

        int menor, mayor;

        if (a < b) {
            menor = a;
            mayor = b;
        } else {
            menor = b;
            mayor = a;
        }

        for (int c = menor; c <= mayor; c++) {
            System.out.println(c);
        }
    }
}
import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double a; 
        int b;    
        double c = 0; 

        System.out.println("introduce el pago del primer mes:");
        a = s.nextDouble();

        System.out.println("introduce la cantidad de meses:");
        b = s.nextInt();

        for (int i = 1; i <= b; i++) {
            System.out.println("mes " + i + ": " + a);
            c = c + a;
            a = a * 2;
        }

        System.out.println("total pagado:");
        System.out.println(c);
    }
}
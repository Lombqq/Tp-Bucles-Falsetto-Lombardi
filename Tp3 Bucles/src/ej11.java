public class ej11 {
    public static void main(String[] args) {
        
        
        for (int a = 100; a >= 0; a -= 23) {
            System.out.println(a);
        }

        
        int b = 100;
        while (b >= 0) {
            System.out.println(b);
            b -= 23;
        }

        
        int c = 100;
        do {
            System.out.println(c);
            c -= 23;
        } while (c >= 0);
    }
}
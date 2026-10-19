import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.1416;
            System.out.print ("Radio de un circulo : ");
            double radio = sc.nextDouble();
            double longitud = 2 * radio * PI;
            System.out.println ("la longitud de la cicunferencia es: " + longitud); 
    }
}
    
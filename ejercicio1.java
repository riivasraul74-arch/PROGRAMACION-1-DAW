import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir un número entero y mostrar el doble
        System.out.print("Introduce un número entero: ");
        int numeroEntero = scanner.nextInt();
        int doble = numeroEntero * 2;
        System.out.println("El doble de " + numeroEntero + " es: " + doble);

        // 2. Pedir un número decimal y mostrar su división entre 10
        System.out.print("Introduce un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        double division = numeroDecimal / 10;
        System.out.println("El resultado de dividir " + numeroDecimal + " entre 10 es: " + division);

        scanner.close();
    }
}
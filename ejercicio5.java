import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        final double PORCENTAJE_IVA = 0.21;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio por hora de trabajo (€): ");
        double precioHora = sc.nextDouble();

        System.out.print("Introduce el número de horas empleadas: ");
        double horas = sc.nextDouble();

        double subtotal = precioHora * horas;
        double iva = subtotal * PORCENTAJE_IVA;
        double total = subtotal + iva;

        System.out.println("\n--- DESGLOSE DE FACTURA ---");
        System.out.println("Subtotal mano de obra: " + subtotal + " €");
        System.out.println("IVA (21%): " + iva + " €");
        System.out.println("Total a pagar: " + total + " €");

        sc.close();
    }
}
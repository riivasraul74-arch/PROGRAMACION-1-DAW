import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio inicial del producto (€): ");
        double precioOriginal = sc.nextDouble();

        System.out.print("Introduce el porcentaje de descuento (%): ");
        double porcentajeDescuento = sc.nextDouble();

        double cantidadDescontada = precioOriginal * (porcentajeDescuento / 100);
        double precioFinal = precioOriginal - cantidadDescontada;

        System.out.println("Cantidad descontada: " + cantidadDescontada + " €");
        System.out.println("Precio final: " + precioFinal + " €");

        sc.close();
    }
}
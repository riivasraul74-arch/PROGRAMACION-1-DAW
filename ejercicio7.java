import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        final double PRECIO_ADULTO = 12.0;
        final double PRECIO_INFANTIL = 8.0;
        final double PRECIO_BEBIDA = 1.5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de menús de adulto: ");
        int menusAdulto = sc.nextInt();

        System.out.print("Número de menús infantiles: ");
        int menusInfantiles = sc.nextInt();

        System.out.print("Número de bebidas: ");
        int bebidas = sc.nextInt();

        double total = (menusAdulto * PRECIO_ADULTO) + 
                       (menusInfantiles * PRECIO_INFANTIL) + 
                       (bebidas * PRECIO_BEBIDA);

        System.out.println("El importe total de la comida es: " + total + " €");

        System.out.print("Cantidad abonada por el cliente (€): ");
        double abonado = sc.nextDouble();

        double cambio = abonado - total;
        System.out.println("El cambio a devolver es: " + cambio + " €");

        sc.close();
    }
}
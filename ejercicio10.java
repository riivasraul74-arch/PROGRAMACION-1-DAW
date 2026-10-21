import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el capital inicial (€): ");
        double capitalInicial = sc.nextDouble();

        System.out.print("Introduce el interés anual (%): ");
        double interes = sc.nextDouble();

        System.out.print("Introduce el número de años: ");
        double anos = sc.nextDouble();

        double capitalFinal = capitalInicial * Math.pow(1 + (interes / 100), anos);

        System.out.println("El capital final acumulado tras " + anos + " años es de: " + capitalFinal + " €");

        sc.close();
    }
}
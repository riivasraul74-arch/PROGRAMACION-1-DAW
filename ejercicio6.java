import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println(fahrenheit + " °F equivalen a " + celsius + " °C");

        sc.close();
    }
}
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica el número total de segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int segundosRestantes = totalSegundos % 3600;

        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;

        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

        sc.close();
    }
}
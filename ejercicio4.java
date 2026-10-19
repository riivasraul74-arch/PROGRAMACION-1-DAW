import java.util.Scanner;
public class ejercicio4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Distancia en kilometros : ");
        final double MILLAS = 1.609;
        double kilometros = sc.nextDouble();
        double distancia = kilometros * MILLAS;
        System.out.println("La distancia total es de : " + distancia);
    }
}
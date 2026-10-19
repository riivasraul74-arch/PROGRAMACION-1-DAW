import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println ("intruduzca la cantidad de dinero que hay en la caja : " );
        System.out.println ("intruduzca la cantidad de gastos que ha habido este mes : " );
        double cantidadDinero = sc.nextDouble();
        double cantidadGastos = sc.nextDouble();
        double cantidadTotal = cantidadDinero + cantidadGastos;
        System.out.println ("El dinero que queda en total es : " + cantidadTotal);
    }
}



import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Tienes " + edad + " años");
    }
}

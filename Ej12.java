public class Ej12 {
    public static void main(String[] args) {
        // Si no añadimos la 'f' o 'F' al final, Java lo interpreta como 'double'
        // y da un error de compilación: "incompatible types: possible lossy conversion from double to float".
        
        // Forma correcta:
        float pi = 3.14f;

        System.out.println("El valor de pi es: " + pi);
    }
}
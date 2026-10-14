public class ej16 {
    public static void main (String [] args ) {
        final double IRPF = 0.15;
        double sueldoBruto = 2000.0;
       double sueldoNeto = sueldoBruto - (sueldoBruto * IRPF);
        System.out.println ("El resultado es" + sueldoNeto );
    }
}
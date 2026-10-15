//iniciamos una variable num1 a 10 y num2 a 3, multiplicamos los dos numeros y imprimimos por pantalla el resultado
/**
 * 
 * 
 * @author Raúl Rivas Bello
 * @version 1.0
 * */
public class ej20{
    public static void main (String[]args){
        
        int num1 = 10;
        int num2 = 3;
        int multiplicacion = multiplicar(num1,num2);
        System.out.println ("el resultado de la multiplicacion es " + multiplicacion);
    }

    /**
     * multiplica dos numeros enteros 
     * 
     * @param num1 primer numero entero
     * @param num2 segundo numero entero
     * @return la multiplicacion de los dos numeros 
     */
    public static int multiplicar(int nummero1, int numero2){
        return nummero1 *  numero2;
    }

}

package tareasemana08;

/*escribir un programa en java para mostrar los N primeros numeros de una 
progresion aritmetica de forma ascendente y determinar la suma de dichos numeros.
 */
import java.util.Scanner;
public class Ejercicio01 {

    public static void main(String[] args) {
        int suma=0;
    Scanner lectura=new Scanner(System.in);
    
        for (int i = 0; i < 100; i+=5) {
            System.out.println(i);
             suma+=i;
        }
        System.out.println("la suma de los numeros de ddicha progresion es  : "+suma);
    }
    
}


package tareasemana08;

/*Escribir un programa en java que permita mostrar una progresion aritmetica
de forma descendente, y determinar la multiplicacion de dichos numeros.
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[]args){
        long mult=1;
        Scanner lectura=new Scanner(System.in);
        
        //proceso
        for (int i = 50; i >0; i-=3) {
            System.out.println(i);
            mult*=i;
            
        }
        System.out.println("El producto de dichos numeros es : "+mult);
    }
    
}

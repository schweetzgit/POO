
package usascanner;
import java.util.Scanner; //similar a las bibliotecas

public class UsaScanner {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int x;
        System.out.println("Ingresa el valor de x: ");
        x = lectura.nextInt();
        System.out.println("El valor de x es: "+x);
    }  
}

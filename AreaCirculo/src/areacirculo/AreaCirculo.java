
package areacirculo;
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
      Scanner lee = new Scanner(System.in);
      float radio;
      final float pi=3.1416f; //se usa final para definir constantes
      float area;
      
        System.out.println("Ingresar el radio: ");
        radio=lee.nextFloat();
        area=pi*radio*radio;
        
        System.out.println("\nEl área del círculo de radio "+radio+" es: "+area);
    }
    
}

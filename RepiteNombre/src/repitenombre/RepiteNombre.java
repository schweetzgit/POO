
package repitenombre;
import java.util.Scanner;
public class RepiteNombre {
    public static void main(String[] args) {
        Scanner leeEntero=new Scanner(System.in);
        Scanner leeCadena=new Scanner(System.in);
        String nombre;
        int edad, i;
        System.out.println("\n Nombre? ");
        nombre=leeCadena.nextLine();
        System.out.println("\n Edad? ");
        edad=leeEntero.nextInt();
        System.out.println("\n Tu nombre es: " + nombre + " y tu edad es: " + edad);
    
        for(i = 1; i < edad; i++){
            System.out.println("\n"+ i +" - "+ nombre);
        }
    
    }
}
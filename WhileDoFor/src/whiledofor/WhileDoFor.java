package whiledofor;
import java.util.Scanner;
//Clase Objeto=new Constructor();
public class WhileDoFor {
    public static void pruebaWHILE(String nombre, int edad){
        //static->para ser usada por todos los objetos
        System.out.println("\nRepite el Nombredel usuario con while\n");
        int contador=0;
        while(contador < edad){
            System.out.println(contador + "-" + nombre);
            contador++;
        }
    }

    public static void pruebadoDoWhile(String nombre, int edad){
        System.out.println("\nRepite el Nombredel usuario con do-while\n");
	int contador=1;
        do{
            System.out.println(contador + "-" + nombre);
            contador++;
        }while(contador <= edad);
    }
    
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);//Objeto: lectura
        String nombre;
	int edad;
        System.out.println("\nNombre: ");
	nombre=lectura.nextLine();
        System.out.println("\nEdad: ");
        edad=lectura.nextInt();
        
	pruebaWHILE(nombre, edad);
        pruebadoDoWhile(nombre, edad);
    }
}

package claseabstracta;
import java.util.Scanner;

abstract class Estudiante{
    private int dia;
    private int mes;
    private int year;
    private String nombre;

    public Estudiante(){
        Scanner leer=new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre=leer.nextLine();
        System.out.print("Dia(00): ");
        dia=leer.nextInt();
        System.out.print("Mes(00): ");
        mes=leer.nextInt();
        System.out.print("Año(0000): ");
        year=leer.nextInt();
    }
    abstract public void datos();
    public void mostrar(){
        System.out.println("\nNombre: " + nombre);
        System.out.println("Fecha de nacimiento: "+dia+"/ "+mes+" /"+year);
        datos(); 
    }
}

class Primaria extends Estudiante{
    public Primaria(){
        super(); 
    }
    public void datos(){
        System.out.println("Escolaridad: Primaria\n");
    }
}
class Secundaria extends Estudiante{
    public Secundaria(){
        super();
    }
    public void datos(){
        System.out.println("Escolaridad: Secundaria\n");
    }
}
    class Bachillerato extends Estudiante{
    public Bachillerato(){
        super();
    }
    public void datos(){
        System.out.println("Escolaridad: Bachillerato\n");
    }
}
class Universidad extends Estudiante{
    public Universidad(){
        super();
    }
    public void datos(){
        System.out.println("Escolaridad: Universidad\n");
    }
}
public class ClaseAbstracta {
    public static void main(String[] args) {
        Primaria est1 = new Primaria();
        est1.mostrar();
        
        Secundaria est2 = new Secundaria();
        est2.mostrar();
        
        Bachillerato est3 = new Bachillerato();
        est3.mostrar();
        
        Universidad est4 = new Universidad();
        est4.mostrar();
    }
}

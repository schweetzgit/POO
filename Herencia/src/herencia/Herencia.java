package herencia;
import java.util.Scanner;
class Persona{
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    
    public Persona(String nom,String ape1,String ape2){
        nombre = nom; // Sobrecarga implementada
        primerApellido = ape1;
        segundoApellido = ape2;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getprimerApellido(){
        return primerApellido;
    }
    
    public String getsegundoApellido(){
        return segundoApellido;
    }
    
    public void imprime(){
        System.out.println("\n" + nombre + "\n" + primerApellido + "\n" + segundoApellido);
    }
}

class Estudiante extends Persona{
    private String carrera;
    private Float promedio;
    
    public Estudiante(String nom, String ape1, String ape2, String carre, Float prom){
        super(nom,ape1,ape2);//Se invoca al constructor de la superclase
        carrera = carre;
        promedio = prom;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public Float getPromedio(){
        return promedio;
    }
    
    public void imprimeEst(){
        imprime();
        System.out.print(carrera + "\n" + promedio);
    }
}
public class Herencia {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        String nom,ap1,ap2,car;
        Float prom;
        Estudiante est1=new Estudiante("Juan","Perez","Navarro","MAC",10.0F);
        est1.imprimeEst();
        
        System.out.println("\n\nNombre:");
        nom=lectura.nextLine();
        System.out.println("Primer apellido:");
        ap1=lectura.nextLine();
        System.out.println("Segungo apellido:");
        ap2=lectura.nextLine();
        System.out.println("Carrera:");
        car=lectura.nextLine();
        System.out.println("Promedio:");
        prom=lectura.nextFloat();
        
        Estudiante est2= new Estudiante(nom,ap1,ap2,car,prom);
        est2.imprimeEst();
        
        System.out.println("\n\nSegundo apellido es: " + est2.getprimerApellido());
    }  
}

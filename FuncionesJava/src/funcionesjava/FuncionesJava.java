
package funcionesjava;
import java.util.Scanner; //Protecto
//->Clases en otro archivo dentro del mismo paquete
//->En el mismo archivo donde esta el main
class Circulo{
    private float radio;
    private final float pi=3.1416f; //f->indicar que es float y no double
    public Circulo(float radi){ //Constructor
        radio=radi;
    }
    public void areaCirculo(){ //Procedimiento
        System.out.println("\nEl área del circulo de radio = "+radio+ " es igual "+pi*radio*radio);
    }   
}
public class FuncionesJava {
    public static double suma(double a, double b){
        double z;
        z=a+b;
        return z;
    }
    public static void comparaElementos(float x, float y){
        if(x<y) 
            System.out.println(x+" es menor que "+y);
        else if(x>y)
            System.out.println(x+" es mayor que "+y);
        else   
            System.out.println(x+" es igual a "+y);
    }
    //Funcion principal
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        double p,q;
        float a=8,b=-5;
        System.out.println("\nDar un valor double:  ");
        p=lectura.nextDouble();
        System.out.println("\nDar un valor double:  ");
        q=lectura.nextDouble();
        System.out.println("\nLa suma de "+p+" + "+q+" es: "+suma(p,q));
        
        System.out.println("\nInvoca al procedimeinto definido en otro archivo fuera de la clase del main: ");
        MayorMenorIgual Compara=new MayorMenorIgual(); //Objeto: Compara
        Compara.mayorMenorIgual(a, b);
          
        System.out.println("\nInvoca al procedimeinto definido dentro de la clase del main: ");
        comparaElementos(a,b);
        
        //Creacion de objeto circulo
        Circulo c1=new Circulo(10);
        c1.areaCirculo();
    }
}

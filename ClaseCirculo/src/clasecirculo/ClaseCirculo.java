package clasecirculo;
import java.util.Scanner;
public class ClaseCirculo {
    public static void main(String[] args) {
         Scanner lee=new Scanner(System.in);
	float rad,mx,my;

	Circulo cir1=new Circulo(100.0f, 150.0f, 200.0f);
	System.out.println("\nEl radio de cir1 es: " + cir1.get_radio());
	System.out.println("\nLa coordenada del cir1 es: " + cir1.get_x() + " , " + cir1.get_y() );
	cir1.calculaArea();
	cir1.calculaPerimetro();
        
	System.out.println("\nDar radio: " );
	rad=lee.nextFloat();
	System.out.println("\nDar el valor de x: " );
	mx=lee.nextFloat();
	System.out.println("\nDar el valor de y: " );
	my=lee.nextFloat();

	Circulo cir2=new Circulo(rad, mx, my);
	System.out.println("\nEl radio de cir2 es: " + cir2.get_radio());
	System.out.println("\nLa coordenada del cir2 es: " + cir2.get_x() + " , " + cir2.get_y() );
	cir2.calculaArea();
	cir2.calculaPerimetro();
    }  
}

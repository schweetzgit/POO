
package templatejava;
import java.lang.reflect.Array;
import java.io.*;
import java.math.*;

public class TemplateJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double a, b, c, d, x1r, x1i, x2r, x2i;
        //introduzca el valor de los coeficientes
        System.out.println("Escriba el valor del coeficiente A: ");
        a = leerDouble();
        System.out.println("Escriba el valor del coeficiente B: ");
        b = leerDouble();
        System.out.println("Escriba el valor del coeficiente C: ");
        c = leerDouble();
        // el valor de 'a' debe ser diferente de cero
        if (Math.abs(a)<1.0e-12){
            System.out.println(
                "El valor de A debe ser diferente de cero!"
            );
            return;
        }
        // inicializamos estas variables a cero
        x1i=x2i=0.0;
        // calcular el discriminante
        d=Math.pow(b,2.0)-4.0*a*c;
        // seleccionar si hay raices o complejas
        if (d>=0.0) {
            x1r=(-b+Math.sqrt(d))/(2.0*a);
            x2r=(-b-Math.sqrt(d))/(2.0*a);
        }
        else {
            x1r=-b/(2.0*a);
            x2r=x1r;
            x1i=Math.sqrt(-d)/(2.0*a);
            x2i=x1i;
        }
        System.out.println("Resultados: ");
        System.out.printf("X1 = %+f%+fi\n",x1r,x1i);
        System.out.printf("X2 = %+f%+fi\n",x2r,x2i);
    }
    public static double leerDouble() {
        BufferedReader buf=new BufferedReader(
                new InputStreamReader(System.in)
        );
        String str;
        try {
            str=buf.readLine();
        } catch (IOException ioe){
            str=null;
        }
        double num;
        try {
            num=Double.parseDouble(str);
        } catch (NumberFormatException nfe){
            num=0.0;
        }
        return num;
    }
    
}


package usomath;
import java.io.*;
import java.lang.Math;

public class UsoMath {
    public static void main(String[] args) {
        BufferedReader Lectura=new BufferedReader(new InputStreamReader(System.in));
        double raizc, result;
        String unaLinea;
        double base, exponente;
        try{
            System.out.println("\nCalcula la potencia dada la base y el exponente\n\n");
            System.out.println("\nBase: ");
            unaLinea=Lectura.readLine();
            base=Double.parseDouble(unaLinea);
            System.out.println("\nExponente: ");
            unaLinea=Lectura.readLine();
            exponente=Double.parseDouble(unaLinea);
            result=Math.pow(base,exponente);
            System.out.println("\n"+base+"^"+exponente+"="+result);
            System.out.println("\nCalcula la raiz cuadrada de un numero\n\n");
            System.out.println("\nDar un numero: ");
            unaLinea=Lectura.readLine();
            raizc=Double.parseDouble(unaLinea);
            System.out.println("\nLa raiz cuadrada de "+raizc+"="+Math.sqrt(raizc));
        }
        catch(Exception e){
            System.out.println("\nError"+e);
        }
    }    
}

package archivoguardartipo2;
import java.io.BufferedReader; //lecturas desde consola
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Persona {
    private String nombre;
    private String direccion;
    private String telefono;
    
    public Persona (){
        nombre = null;
        direccion = null;
        telefono = null;
    }
    public void leeDatos(){
        Scanner lee = new Scanner(System.in);
        System.out.print("\n NOMBRE: ");
        nombre=lee.nextLine();

        System.out.print("\n DIRECCION: ");
        direccion=lee.nextLine();

        System.out.print("\n TELEFONO: ");
        telefono=lee.nextLine();
    }
    public void imprimeRegistro(){
        System.out.println("\n NOMBRE: "+ nombre);
        System.out.println("\n DIRECCION: "+ direccion);
        System.out.println("\n TELEFONO: "+ telefono);
    }
    public void guardar(){
        Scanner lee = new Scanner(System.in);
        PrintWriter archivo=null;
        try{
            archivo = new PrintWriter("C:/borrame/MACdatos.txt");
            archivo.println(nombre);
            archivo.println(direccion);
            archivo.println(telefono);
            System.out.println(" \n LOS DATOS HAN SIDO GUARDADOS EXITOSAMENTE");
        }
        catch (FileNotFoundException error){
            System.out.println(" ERROR EN LA APERTURA DE ARCHIVO "+error); 
        }
        catch(Exception w) {
            System.out.println(" ERROR EN LA LECTURA "+w);
        }
        finally{
            archivo.close();
            
        }
    }
    public void leeArchivo(){
        FileReader archivo=null;
        try{
            archivo=new FileReader ("C:/borrame/MACdatos.txt");
            BufferedReader archi= new BufferedReader (archivo);
            String cadena;
            cadena=archi.readLine(); //LEE LINEA POR LINEA DEL ARCHIVO
            while (cadena!=null){
                System.out.println(cadena);
                cadena=archi.readLine();
            }
        }
        catch(FileNotFoundException z){
            System.out.println("ERROR EN APERTURA DE ARCHIVO "+z);
        }
        catch(Exception w){
            System.out.println("ERROR "+w);
        }
        finally {
            try {
                if(archivo!=null)
                    archivo.close();
            }
            catch (IOException r){
                System.out.println(r);
            }
        }
    }
}
public class ArchivoGuardarTipo2 {
    public static void main(String[] args) {
        Persona obj1=new Persona();
        obj1.leeDatos();
        obj1.imprimeRegistro();
        obj1.guardar();
        obj1.leeArchivo();
    }
    
}

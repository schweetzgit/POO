
package archivoguardartipo1;
import java.util.Scanner;
import java.io.*;

public class ArchivoGuardarTipo1 {
    
    public void guardaArchivo(){
        String rutaNombreArchivo;
        Scanner lec = new Scanner(System.in);
        try{
           System.out.println("\nIngresa la ruta y nombre del archivo:");
           rutaNombreArchivo = lec.nextLine();
           
           //Apertura de archivo
	   File arch = new File(rutaNombreArchivo); // crear el objeto
           FileOutputStream unarchi = new FileOutputStream(arch,true);
           DataOutputStream unarchivo = new DataOutputStream(unarchi);

           //Manipular archivo
           unarchivo.writeInt(2021);
           unarchivo.writeLong(9999L);
           unarchivo.writeFloat(10.5f);
           unarchivo.writeDouble(3.1416);
           unarchivo.writeChar('M');
           unarchivo.writeChars("Programacion Orientada a Objetos en Java.");
           //miarchivo.writeBoolean(true);
           System.out.println("\nLos datos fueron almacenados en el archivo exitosamente.\n");
           unarchivo.close();
        }
        catch(Exception unerror){
            System.out.println("\nError en apertura de archivo\n" + unerror);
        }   
    }    
    
    public void lee_de_archivo(){
        String ruta;
        Scanner lect = new Scanner(System.in);
        try{
            System.out.print("\nRuta y nombre del archivo: \n");
            ruta=lect.nextLine();

            //Encontrar archivo
            File arch = new File(ruta);
            FileInputStream unarchi = new FileInputStream(arch);
            DataInputStream unarchivo = new DataInputStream(unarchi);

            System.out.println(unarchivo.readInt());
            System.out.println(unarchivo.readLong());
            System.out.println(unarchivo.readFloat());
            System.out.println(unarchivo.readDouble());
            System.out.println(unarchivo.readChar());
            System.out.println(unarchivo.readLine());
            //System.out.println(miarchivo.readBoolean());

            unarchivo.close();
        }
        catch(Exception error1301){
            System.out.print("Se detecto un error :" + error1301);
        }
    }
    public static void main(String[] args) {
        ArchivoGuardarTipo1 obj1= new  ArchivoGuardarTipo1();
       
       System.out.println("\nLos datos se guardan en");
       obj1.guardaArchivo();
       
       System.out.println("\nLos datos almacenados son:");
       obj1.lee_de_archivo();
    }
    
}

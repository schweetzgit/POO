/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstractaejemplo;
import java.util.Scanner;

abstract class Humano{
    private String Nom;
    private String Ape;

    public Humano(){
        Scanner lee=new Scanner(System.in);
        System.out.print("Nombre: ");
        Nom=lee.nextLine();
        System.out.println("Apellidos: ");
        Ape=lee.nextLine();
    }
    //función abstracta y el cuerpo deberá ser definido en las subclases.
    abstract public void nacionalidad(); // similar a la funcion virtual pura

    public void informe(){ //Polimorfismo, procedimiento
        System.out.println("Nombre: " + Nom);
        System.out.println("Apellidos: " + Ape);
        nacionalidad(); //Polimorfismo
    }
}

class NacionalidaMexicana extends Humano{
    public NacionalidaMexicana(){
        super(); //Invoca al costructor de la superclase
    }
    public void nacionalidad(){
        System.out.println("Nacionalidad: Mexicana");
    }
}

class NacionalidaItaliana extends Humano{
    public NacionalidaItaliana(){
        super();//Invoca al contructor de la superclase
    }
    public void nacionalidad(){
        System.out.println("Nacionalidad: Italiana");
    }
}

class NacionalidaFrancesa extends Humano{
    public NacionalidaFrancesa(){
        super();
    }
    public void nacionalidad(){
        System.out.println("Nacionalidad: Francesa");
    }
}
class NacionalidaArgentina extends Humano{
    public NacionalidaArgentina(){
        super();
    }
    public void nacionalidad(){
        System.out.println("Nacionalidad: Argentina");
    }
}
public class ClaseAbstractaEjemplo {
    public static void main(String[] args) {
        NacionalidaMexicana mex1=new NacionalidaMexicana();
        mex1.informe();

        NacionalidaItaliana  ital1=new NacionalidaItaliana();
        ital1.informe();

        NacionalidaFrancesa franc1=new NacionalidaFrancesa();
        franc1.informe();

        NacionalidaArgentina arg1=new NacionalidaArgentina();
        arg1.informe();
    }
}

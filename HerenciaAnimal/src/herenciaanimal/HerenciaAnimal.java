package herenciaanimal;
import java.util.Scanner;
 class Animal{
      private String nombre;
      private String alimento;
      private String sonido;
    
    public Animal(String nom,String ali, String soni){
        nombre= nom;
        alimento = ali;
        sonido = soni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getAlimento(){
        return alimento;
    }
    public String getSonido(){
        return sonido;
    }
    public void imprime(){
        System.out.println("\nEl nombre de la especie del animal es: "+nombre);
        System.out.println("\nSe alimenta de: " + alimento);
        System.out.println("\nEl sonido que hacer es: " + sonido);
    }
}
class Gato extends Animal{
    private  float peso; 
    private String tipo;
    public Gato(String nom,String ali,String son, float pes, String TipoANIMAL){
        super(nom,ali,son);
        peso = pes;
        tipo= TipoANIMAL;
    }
    public float getPeso(){
        return peso;
    }
    public String getTipo(){
        return tipo;
    }
    public void imprimeG(){
        imprime();
        System.out.println("\nEl gato pesa es: "+peso);
        System.out.println("\nEl gato es un : " + tipo);
    }
 }
public class HerenciaAnimal {
    public static void main(String[] args) {
       Scanner lect= new Scanner(System.in);
       //String nom,ali,son, comeGato;
       //float pes;
       Gato felix = new Gato("Pelusa", "whiskas", "meew", 4.5f, "mamifero");
       felix.imprimeG();
    }
}

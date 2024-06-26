
package claseabstracta2;
abstract class Juego {
    abstract public void datos();
    abstract public void medioTiempo();
    abstract public void terminar();
    
    public void mostrar(){
        datos();
    }
}
class Americano extends Juego {
    public Americano(){
        super(); 
    }
   public void datos() {
      System.out.println("Cricket Game Finished!");
   }

   /*piblic void empezar() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }

   void medioTiempo() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }*/
}
public class ClaseAbstracta2{
    public static void main(String[] args) {
        Americano juego1 = new Americano();
      juego1.mostrar();
    }
}
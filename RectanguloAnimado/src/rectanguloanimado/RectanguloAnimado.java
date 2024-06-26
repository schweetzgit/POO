package rectanguloanimado;
//awt->para graficos
import java.awt.Color; //manipular los colores con frame
import java.awt.Graphics;
import javax.swing.JFrame; //dimensionar la ventana
import javax.swing.JPanel;

public class RectanguloAnimado extends JPanel{ //herencia: extends
    private int x = 0; //Centro del rectangulo
    private int y = 0;
    
    private void mueveRectangulo(){
	x = x + 1;
	y = y + 1;
    }
    //Funcion paint unica
    public void paint(Graphics grafico){ //parametro de tipo Graphics
        super.paint(grafico); //invocando al constructor de JPanel
        grafico.setColor(Color.CYAN);
        grafico.fillRect(x,y,150,80); //contorno
    }
    //throws->por la interrupcion al BIOS
    public static void main(String[]args) throws InterruptedException{
        //Crear la ventana
        JFrame ventana = new JFrame("Grupo 1301: Rectangulo Animado"); //Membrete
	RectanguloAnimado rectangulo1 = new RectanguloAnimado(); //Se crea constructor por omisión
	
	ventana.setSize(600, 600);
        ventana.add(rectangulo1); //agregar
	ventana.setVisible(true);
        //Agregar botones de ventana
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
            rectangulo1.mueveRectangulo();
            rectangulo1.repaint(); //invoca a paint lo necesario
            Thread.sleep(10); //reducir velocidad
        }
    }
}

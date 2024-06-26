package circuloanimado;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CirculoAnimado extends JPanel{
    private int x = 100;
    private int y = 100;
    
    private void mueveCirculo(){
	x = x + 1;
	//y = y + 1;
    }
     public void paint(Graphics grafico) {
	super.paint(grafico);
        grafico.setColor(Color.orange);
        grafico.fillOval(x,y,100,100);
    }
 
    public static void main(String[]args) throws InterruptedException {
        JFrame ventana = new JFrame("Grupo 1301: Circulo Animado");
	CirculoAnimado c1 = new CirculoAnimado();
	
	ventana.setSize(1200, 600);
        ventana.add(c1);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while (true) {
            c1.mueveCirculo();
            c1.repaint();
            Thread.sleep(10);
	}
    }
}

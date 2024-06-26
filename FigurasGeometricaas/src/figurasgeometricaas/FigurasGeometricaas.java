package figurasgeometricaas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FigurasGeometricaas extends JPanel{
    public void paint(Graphics grafico) {
	super.paint(grafico);
        grafico.setColor(Color.BLACK);
        grafico.drawLine(100,100,200,200); //(x1, y1, x2, y2)
        
        grafico.setColor(Color.BLUE);
        grafico.drawOval(200,200,150,150); //contorno
        
        grafico.setColor(Color.yellow);
        grafico.fillOval(400,200,150,150); //relleno
        
        grafico.setColor(Color.DARK_GRAY);
        int [] vx1 = {500,550,450};
        int [] vy1 = {70,120,120};
        grafico.drawPolygon(vx1,vy1,3); //contorno
        
        grafico.setColor(Color.GREEN);
        int [] vxT1 = {700,850,350};
        int [] vyT1 = {100,200,300};
        grafico.fillPolygon(vxT1,vyT1,3); //relleno
        
        grafico.setColor(Color.RED);
        grafico.drawArc(200,350,450,150,0,90); //(x1, y1, x2, y2, 0, 180)
    }
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Grupo 1301: Gama de figuras geometricas");
	FigurasGeometricaas f1 = new FigurasGeometricaas();
	ventana.setSize(1400, 600);
        ventana.add(f1);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }    
}

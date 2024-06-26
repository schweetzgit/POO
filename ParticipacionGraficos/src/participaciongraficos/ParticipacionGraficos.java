package participaciongraficos;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ParticipacionGraficos extends JPanel{
    public void paint(Graphics grafico) {
	super.paint(grafico);
        grafico.setColor(Color.yellow);
        grafico.fillOval(100,100,200,200);
        
        grafico.setColor(Color.black);
        grafico.fillOval(220,150,30,30);
        grafico.fillOval(150,150,30,30);
        grafico.drawArc(150,190,100,80,180,180); 
        
        //Casa
        grafico.setColor(Color.lightGray);
        int [] vx = {400,400,600,600};
        int [] vy = {120,270,270,120};
        grafico.fillPolygon(vx,vy,4); 
        
        int [] vx5 = {600,600,650,650};
        int [] vy5 = {270,120,90,230};
        grafico.fillPolygon(vx5,vy5,4); 
        
        int [] vx6 = {400,440,650,600};
        int [] vy6 = {120,90,90,120};
        grafico.fillPolygon(vx6,vy6,4);
        
        grafico.setColor(Color.black);
        grafico.drawLine(400,120,400,90);//z1
        grafico.drawLine(600,120,600,90);//d1
        
        grafico.drawLine(440,90,440,60);//z2
        grafico.drawLine(650,90,650,60);//d2
        
        grafico.drawLine(400,90,440,60);//izq
        grafico.drawLine(400,105,440,75);
        
        grafico.drawLine(400,90,600,90);//enf
        grafico.drawLine(400,105,600,105);
        
        grafico.drawLine(600,90,650,60);//der
        grafico.drawLine(600,105,650,75);
        
        grafico.drawLine(440,60,650,60);//atr
        grafico.drawLine(440,75,650,75);
        
        grafico.setColor(Color.white);
        int [] vx2 = {415,415,470,470};
        int [] vy2 = {135,180,180,135};
        grafico.drawPolygon(vx2,vy2,4);
        grafico.drawLine(442,135,442,180);
        grafico.drawLine(415,157,470,157);
        
        int [] vx3 = {585,585,530,530};
        int [] vy3 = {135,180,180,135};
        grafico.drawPolygon(vx3,vy3,4);
        grafico.drawLine(557,135,557,180);
        grafico.drawLine(585,157,530,157);
        
        int [] vx4 = {480,480,520,520};
        int [] vy4 = {200,270,270,200};
        grafico.fillPolygon(vx4,vy4,4);
    }
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Java:Carita feliz y Casa");
	ParticipacionGraficos figuras = new ParticipacionGraficos();
	ventana.setSize(800,500);
        ventana.add(figuras);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}

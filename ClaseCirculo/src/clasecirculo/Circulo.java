package clasecirculo;
public class Circulo {
    private float radio;
    private static final float pi= 3.1416f;
    private float x, y;
   
    public Circulo(float inic_radio, float inic_x, float inic_y){
        radio=inic_radio;
        x=inic_x;
        y=inic_y;
    }
    public void calculaArea(){
        System.out.println("El area del circulo de radio" + radio + " es " + pi*radio*radio);
    }

    public void calculaPerimetro(){
        System.out.println("El perimetro del circulo de radio" + radio + " es " + 2*pi*radio);
    }
    public float get_radio(){return radio;}
    public float get_x(){return x;}
    public float get_y(){return y;}
}

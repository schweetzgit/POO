package templates;
import java.lang.reflect.Array;
import java.util.Scanner;

//Metodo de insercion directa
class OrdenacionGenerica <T extends Comparable <T>>{ // T -> tipo de dato
    private T[] vector; 
    private int totalItems;
    private final Class<T> type;
    
    public OrdenacionGenerica(Class<T> temp, int TI){
        totalItems = TI; 
        //vector= new int[totalItems];
        T[] vect = (T[]) Array.newInstance(temp, totalItems); //Se crea el arreglo de tipo T
        this.vector = vect;
        this.type = temp;
    }
    
    public void insercionDirecta(){
        int i,j;
        T temp; // temp -> el que se esta analizando
        for(i=1; i<totalItems; i++){ // i = 1, empieza desde el segundo elemetno
            temp = vector[i];
            j = i-1;
            while((j >= 0)&& (vector[j].compareTo(temp) > 0)){ //compareTo, en Java, para comparar elementos de un arreglo
                vector[j+1] = vector[j];
                j = j-1;
            }
        vector[j+1] = temp;
        }   
    }
        public void imprimeVector(){
        int i;
        for(i=0; i<totalItems ; i++){
            System.out.print(vector[i]+"  ");
        }
    }
    public void leeVector(){
        int i;
        Scanner lee = new Scanner(System.in);
        for (i=0; i<totalItems ; i++){
            try{
            vector[i] = readFromInput("vector[" + i + "] = ", type );
            }catch(Exception sucedioAlgo){
                System.out.println(sucedioAlgo);
            }
        }
    }
    public static <T> T readFromInput(String message, Class<T> c) throws Exception{
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        try {
            if(c == Integer.class)
                // the next cast to Integer is safe
                return c.cast(Integer.valueOf(scanner.nextInt()));
            if(c == String.class)
                // the next cast to String is safe
                return c.cast(scanner.nextLine());
            if(c == Double.class)
                // the next cast to Double is safe
                return c.cast(Double.valueOf(scanner.nextDouble()));
            if(c == Float.class)
                // the next cast to Float is safe
                return c.cast(Float.valueOf(scanner.nextFloat()));
        } catch (Exception e) {
            throw new Exception(e);
        }
        return null;
    }
}

public class Templates {
    public static void main(String[] args) {
        OrdenacionGenerica <Double> objtemp = new OrdenacionGenerica<Double>(Double.class, 6);
        System.out.println("\n ORDENACION DOUBLE: \n");
        objtemp.leeVector();
        objtemp.imprimeVector();
        System.out.println("\n Ordenando: ");
        objtemp.insercionDirecta();
        objtemp.imprimeVector();
        
         System.out.println("\n ORDENACION INTEGER:\n ");
        OrdenacionGenerica <Integer> objtemp2=new OrdenacionGenerica<Integer>(Integer.class, 6);
        objtemp2.leeVector();
        objtemp2.imprimeVector();
        System.out.println("\n Ordenando: ");
        objtemp2.insercionDirecta();
        objtemp2.imprimeVector();
        
        System.out.println("\n ORDENACION FLOTANTES:\n ");
        OrdenacionGenerica <Float> objtemp3=new OrdenacionGenerica<Float>(Float.class, 6);
        objtemp3.leeVector();
        objtemp3.imprimeVector();
        System.out.println("\n Ordenando: ");
        objtemp3.insercionDirecta();
        objtemp3.imprimeVector();
    }   
}

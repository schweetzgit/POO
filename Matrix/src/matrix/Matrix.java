package matrix;
import java.util.Scanner;

public class Matrix {
    void leeMatrix(int [][] Mat, int ren, int col){
        int i, j;
        Scanner lectura = new Scanner(System.in);
        for(i=0; i<ren; i++){
            for(j=0; j<col; j++){
                System.out.println("["+ i + "," + j + "]: ");
                Mat[i][j]= lectura.nextInt();
            }
        }
    }
    
    void imprimeMatrix(int [][] Mat, int ren, int col){
        int i, j;
        for(i=0; i<ren; i++){
            System.out.println();
            for(j=0; j<col; j++){
                System.out.print(" " +  Mat[i][j]);                        
            }
        }
    }

    public static void main(String[] args) {
        int[][] p = new int[3][3];
        int[][] q = new int[3][3];
      
        Matrix  A, B;
        A= new Matrix();
        B= new Matrix();
        A.leeMatrix(p, 3, 3);
        A.imprimeMatrix(p, 3, 3);
     
        B.leeMatrix(q, 3, 3);
        B.imprimeMatrix(q, 3, 3);
    }
}

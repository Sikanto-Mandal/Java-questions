import java.util.*;
public class transposeMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[2][3];
        
        int row = matrix.length;
        int col = matrix[0].length;

        int transpose[][]= new int[col][row];
        
        System.out.println("Enter your matrix elements : ");
        for(int i=0; i <matrix.length; i++){
            for(int j =0; j < matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n Matrix is : ");
        for(int i=0; i <matrix.length; i++){
            for(int j =0; j < matrix[0].length; j++){
               System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0; i <matrix.length; i++){
            for(int j =0; j < matrix[0].length; j++){
            transpose[j][i] = matrix[i][j];
            
            }
        }
        
        for(int i=0; i <col; i++){
            for(int j =0; j < row; j++){
                System.out.println("Your transpose Matrix : \n" + transpose[col][row] +" " );
             }
            
            
        }
        
    }
    
}

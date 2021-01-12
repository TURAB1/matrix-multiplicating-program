package matrixMultiplication;
//import java.io.InputStream;
import java.util.Scanner;

class Matrix{
  public int rows,columns;
 // public int[][] mat=new int[rows][columns];

//Scanner sc= new Scanner(System.in);

    public  Matrix(int r,int c){
      rows=r;
        columns=c;
    }
 
	public int[][] EnterMatrix(){
		
		 int[][] mat=new int[rows][columns];
		Scanner sc= new Scanner(System.in);
		
		//System.out.print("Enter matrix:");
      for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            mat[i][j]=sc.nextInt();
        }
      }
     return mat;
    }
    
    public void matrixMult(int a[][],int b[][]){
    	 int[][] c=new int[rows][columns];
    	   for(int i=0;i<rows;++i){
    		   for(int j=0;j<columns;++j){
    		     for(int k=0;k<rows;++k){
    		  c[i][j]+=a[i][k]*b[k][j];
    		       }
    		       //product[i][j]=sum;
    		       //sum=0;
    		      
    		    }
    		  }
    		  for(int i=0;i<rows;++i){
    		    for(int j=0;j<columns;++j){
    		    System.out.print(c[i][j]+" ");
    		    }
    		    System.out.println();
    		     }
    		    

    }


} 

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		 
		
	
		System.out.println("matrix calculating program");	
		System.out.println("==========================");	
		System.out.println("Enter first matrix:");
		Matrix m1=new Matrix(3,3);
		int[][] a=new int[m1.rows][m1.columns];
		a=m1.EnterMatrix();
		
		
		
		System.out.println("Enter another matrix:");
		Matrix m2=new Matrix(3,3);
		 int[][] b=new int[m2.rows][m2.columns];
		 b=m2.EnterMatrix();
		 
		 System.out.println("the result is:");
		 m2.matrixMult(a,b);
		
	}

		
}

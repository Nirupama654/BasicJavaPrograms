/*	Matrix Multiplication Program	*/
public class MatrixMultiplication{  
	public static void main(String args[]){      
		int a[][]={{1,2,3},{2,3,4},{3,4,5}};    
		int b[][]={{5,6,7},{6,7,8},{7,8,9}};      
		int c[][]=new int[3][3]; 
    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=0;      
				for(int k=0;k<3;k++){      
					c[i][j]+=a[i][k]*b[k][j];      
				}//end of k loop  
			System.out.print(c[i][j]+" ");  //printing matrix element  
			}//end of j loop  
			System.out.println();//new line    
		}    
	}
}  
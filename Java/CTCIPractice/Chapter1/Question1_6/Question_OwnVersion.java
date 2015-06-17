package Question1_6;

import CtCILibrary.AssortedMethods;

/**
 * 
 * @author cr486
 * 
 * This method uses two steps to rotate the matrix:
 * 
 * 1. transpose the matrix
 * 2. flip the matrix
 * 
 * Therefore, it is very easy to implement clockwise and 
 * counter clockwise rotations.
 * 
 * My version is actually slower than the book version
 *
 */

public class Question_OwnVersion {
	
	public static void rotate(int[][] matrix, int n) {
		int i,j; // temp var
		for (i = 0; i < n; i++){
			for (j = 0; j < i; j++){
				int temp = matrix[i][j];
				matrix[i][j] =  matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(i = 0; i < n; i++){
			for (j = 0; j < n / 2; j++){
				int temp = matrix[i][j];
				matrix[i][j] =  matrix[i][n-j-1];
				matrix[i][n-j-1] = temp;
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(1000, 1000, 0, 9);
		//AssortedMethods.printMatrix(matrix);
		long startTime = System.nanoTime();
		rotate(matrix, 10);
		long endTime = System.nanoTime();
		System.out.println();
		//AssortedMethods.printMatrix(matrix);
		System.out.println();
		System.out.println("Runing Time: "+(endTime - startTime)+ "ns");
	}


}

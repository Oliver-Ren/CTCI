package ArrayStride;

import CtCILibrary.AssortedMethods;
import CtCILibrary.*;

/**
 * 
 * @author Chengxiang Ren
 * 
 * This code tests the stride of the array
 * proved that the spatial locality of the array.
 *
 *
 */
public class ArrayStride {

	public static void main(String[] args) {
		int row = 2000;
		int col = 2000;
		int [][] matrix = AssortedMethods.randomMatrix(row, col, 0, 9);
		int [][] matrix2 = new int[row][col];
		long startTime = System.nanoTime();
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				matrix2[j][i] = matrix[j][i];
				//matrix2[i][j] = matrix[i][j];
		long endTime = System.nanoTime();
		System.out.println();
		//AssortedMethods.printMatrix(matrix);
		System.out.println();
		System.out.println("Runing Time: "+(endTime - startTime) / 1000 + "ms");
		
		// TODO Auto-generated method stub

	}

}

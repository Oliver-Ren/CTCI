package Question1_6;

import CtCILibrary.*;

/**
 * 
 * @author cr486
 * This is the "optimized" verison of the rotation as the book 
 * described.
 * 
 * the optimization is mainly on the cache locality.
 * 
 * The optimization failed because four correspond elements change 
 * in the same loop. take care
 * 
 * 
 */

public class Question_Optimized {

	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 			

				// bottom -> left
				matrix[i][first] = matrix[last][i]; //There is a change

				// right -> bottom
				matrix[last][i] = matrix[last - offset][last];  // There is a change

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(50, 50, 0, 9);
		AssortedMethods.printMatrix(matrix);
		long startTime = System.nanoTime();
		rotate(matrix, 10);
		long endTime = System.nanoTime();
		System.out.println();
		AssortedMethods.printMatrix(matrix);
		System.out.println();
		System.out.println("Runing Time: "+(endTime - startTime)+ "ns");
	}

}

package Question1_6;

import CtCILibrary.*;

/**
 * 
 * @author cr486
 * This is the original verison of the rotation as the book 
 * described.
 * 
 * The executing time is about 4300ns.
 */

public class Question {

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
				matrix[last-offset][first] = matrix[last][last - offset]; 

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
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

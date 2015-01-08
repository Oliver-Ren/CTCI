public class Question{
	public static void setZero(int [][] mat) {
		int N = mat[0].length;
		int M = mat.length;
		int [] rowsToBeZeroed = new int[M];
		int [] columsToBeZeroed = new int[N];
		int i,j;

		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				if (mat[i][j] == 0) {
					rowsToBeZeroed[i]++;
					columsToBeZeroed[j]++;
				}
			}
		}

		for (i=0; i < M; i++) {
			if (rowsToBeZeroed[i] > 0){
				for (j = 0; j < N; j++)
					mat[i][j] = 0;
			}
			else for (j = 0; j < N; j++) {
				if (columsToBeZeroed[j] > 0)
					mat[i][j] = 0;
			}
		}
			
	}

	public static void main(String args[]){
		int [][] matrix = {{1},{4}};
		setZero(matrix);

	}
}


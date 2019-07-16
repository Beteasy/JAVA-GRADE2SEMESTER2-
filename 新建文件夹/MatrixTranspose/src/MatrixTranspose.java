
public class MatrixTranspose {
	public static void main(String[] argv)
	{
		int matrix[][] = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int matrix2[][] = new int[4][3];
		int i, j;
		for(i=0; i<3; i++)
		{
			/*for(j=0; j<i; j++)	//行列相同
			{
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}*/
			for(j=0; j<4; j++)	//行列不同
			{
				matrix2[j][i] = matrix[i][j];
				
			}
			
		}
		/*for(i=0; i<matrix.length; i++)	//行列相同
		{
			for(j=0; j<matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}*/
		for(i=0; i<4; i++)	//行列不同
		{
			for(j=0; j<3; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
		System.out.println();
			
		}
	}

}

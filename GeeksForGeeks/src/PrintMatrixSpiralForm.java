
public class PrintMatrixSpiralForm {
	
	public static void printSpiralForm(int[][] mat, int m, int n)
	{
		int k=0,l=0;
		int i=0;
		while(k<m && l<n)
		{
			for(i=l;i<n;i++)
				System.out.print(mat[k][i]+" ");
			++k;
			
			for(i=k;i<m;i++)
				System.out.print(mat[i][n-1]+" ");
			--n;
			
			for(i=n-1;i>=l;i--)
				System.out.print(mat[m-1][i]+" ");
			--m;
			
			for(i=m-1;i>=k;i--)
				System.out.print(mat[i][l]+" ");
			++l;
		}
	}
	public static void main(String[] args)
	{
		int[][] arr = {{1,3,5,10,1},{4,8,11,15,2},{6,10,15,16,3},{8,11,20,30,4}};
		printSpiralForm(arr,4,5);
		
	}

}

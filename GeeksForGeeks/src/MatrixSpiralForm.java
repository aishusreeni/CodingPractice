
public class MatrixSpiralForm {
<<<<<<< HEAD
	
	public static void printSpiral(int[][] arr, int m, int n)
	{
		int l=0,k=0,i=0,j=0;
		while(k<=m && l<=n)
		{
			i=k;
			for(j=l;j<=n;j++)
				System.out.print(arr[i][j]+ " ");
			k++;
			
			j=n;
			for(i=k;i<=m;i++)
				System.out.print(arr[i][j]+" ");
			n--;
			
			i=m;
			for(j=n;j>=l;j--)
				System.out.print(arr[i][j]+" ");
			m--;
			
			j=l;
			for(i=m;i>=k;i--)
				System.out.print(arr[i][j]+" ");
			l++;
		}
	}
	
	public static void main(String[] args)
	{
		int[][] arr = {{1,2,3,4},{10,11,12,5},{9,8,7,6},{5,4,3,2}};
		printSpiral(arr,3,3);
	}
=======
>>>>>>> f05d141ff277e14d20fa3402d2aa045d258e8a53

}

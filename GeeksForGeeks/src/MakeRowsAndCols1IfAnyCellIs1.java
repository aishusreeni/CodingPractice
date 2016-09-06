
public class MakeRowsAndCols1IfAnyCellIs1 {
	
	public static void convert(int[][] arr, int m, int n)
	{
		int[] rows = new int[m];
		int[] cols = new int[n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]==1)
				{
					rows[i]=1;
					cols[j]=1;
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(rows[i]==1 || cols[j]==1)
				{
					arr[i][j]=1;
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		//int[][] arr = {{0,1,0,0,0},{0,0,1,0,0},{1,0,0,0,0},{0,0,0,0,0}};
		int[][] arr = { {1, 0, 0, 1},
		        {0, 0, 1, 0},
		        {0, 0, 0, 0},
		    };
		convert(arr,3,4);
	}

}

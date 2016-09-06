
public class MinInitialPointsToReachDestination {
	
	static int val=0;
	
	public static void calculate(int[][] arr,int i,int j,int sum)
	{
		if(i>4 || j>4)
		{
			return;
		}
		int temp1 = sum + arr[i+1][j];
		calculate(arr,i+1,j,sum+arr[i+1][j]);
		int temp2 = sum + arr[i][j+1];
		calculate(arr,i,j+1,sum+arr[i][j+1]);
		if(i==4 && j==4)
		{
			if(temp1>val && temp1<0)
				val = sum+arr[i+1][j];
			if(sum+arr[i][j+1]>val && sum+arr[i][j+1]<0)
				val = sum+arr[i][j+1];
		}
	}

}

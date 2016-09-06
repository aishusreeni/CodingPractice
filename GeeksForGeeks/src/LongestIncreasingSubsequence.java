
public class LongestIncreasingSubsequence {
	
	public static void LIS(int[] arr)
	{
		int length = arr.length, max=1;
		int[] dp = new int[length];
		for(int i=0;i<length;i++)
			dp[i]=1;
		for(int i=0;i<length;i++)
		{
			max=dp[i];
			for(int j=0;j<i;j++)
			{
				if(dp[j]+1>max && arr[j]<arr[i])
					max = dp[j]+1;
			}
			dp[i]=max;
		}
		for(int i=0;i<length;i++)
			System.out.println(dp[i]);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {0,1,3,4,2,5};
		LIS(arr);
	}

}

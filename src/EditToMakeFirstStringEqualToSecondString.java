
public class EditToMakeFirstStringEqualToSecondString {
	
	public static void edit(String str1, String str2, int m, int n)
	{
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0)
					dp[i][j]=j;
				else if(j==0)
					dp[i][j]=i;
				else if(str1.charAt(i-1)==str2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				else
					dp[i][j]=1+Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
			}
		}
		System.out.println(dp[m][n]	);
	}
	
	public static void main(String[] args)
	{
		edit("sunday","saturday",6,8);
	}

}

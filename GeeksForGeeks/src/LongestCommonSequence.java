
public class LongestCommonSequence {
	
	public static void LCS(String str1, String str2, int m, int n)
	{
		int[][] LCS = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0)
					LCS[i][j]=0;
				else if(str1.charAt(i)==str2.charAt(j))
					LCS[i][j]=LCS[i-1][j-1]+1;
				else
					LCS[i][j]=Math.max(LCS[i-1][j],LCS[i][j-1])	;
			}
		}
	}

}

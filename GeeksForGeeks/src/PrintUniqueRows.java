import java.util.HashSet;
import java.util.Set;

public class PrintUniqueRows {
	
	public static void printUniqueRows(int[][] arr, int m, int n)
	{
		Set<String> set = new HashSet<String>();
		for(int i=0;i<m;i++)
		{
			String str = "";
			for(int j=0;j<n;j++)
			{
				str+=arr[i][j]+" ";
			}
			if(!set.isEmpty() && !set.contains(str))
			{
				System.out.println(str);
			}
			if(set.isEmpty())
				System.out.println(str);
			set.add(str);
		}
	}
	
	public static void main(String[] args)
	{
		int[][] arr = {{0, 1, 0, 0, 1},
		        {1, 0, 1, 1, 0},
		        {0, 1, 0, 0, 1},
		        {1, 0, 1, 0, 0}
		    };
		printUniqueRows(arr,4,5);
	}

}

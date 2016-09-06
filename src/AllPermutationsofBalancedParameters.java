import java.util.HashSet;
import java.util.Set;

public class AllPermutationsofBalancedParameters {
	
	public static void printPermutations(int open,int close, String str, int n)
	{
		if(open<close || open>n)
			return;
		else
		{
			if(close==n)
				System.out.println(str);
			else
			{
				printPermutations(open+1, close, str+"(", n);
				printPermutations(open, close+1, str+")", n);
			}
		}
	}
	
	public static void main(String[] args)
	{
		printPermutations(0,0,"",3);
	}

}

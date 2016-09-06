
public class CountNumberOfSteps {
	
	static int count=0;
	
	public static int count(int n)
	{
		count++;
		if(n%2==0)
		{
			count++;
			count(n-1);
		}
		if(n%3==0)
		{
			count++;
			count(n-1);
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int n=4;
		System.out.println(count(4));
	}

}

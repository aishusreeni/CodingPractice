
public class NumberOccurringOddTimes {
	
	public static void findOdd(int[] arr)
	{
		int length = arr.length;
		int val = 0;
		for(int i=0;i<length;i++)
		{
			//System.out.println(arr[i]);
			val = val ^ arr[i];
		}
		System.out.println(val);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,5,5,2,4,4,1,2,1};
		findOdd(arr);	
	}

}

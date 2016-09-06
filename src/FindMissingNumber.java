
public class FindMissingNumber {
	
	public static void findMissing(int[] arr)
	{
		int length = arr.length;
		int sum = (length+1)*(length+2)/2;
		for(int i=0;i<length;i++)
		{
			sum-=arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 4,6, 3, 7, 8};
		findMissing(arr);
	}

}

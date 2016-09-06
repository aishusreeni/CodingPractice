
public class FindOddOccurencesOfANumber {
	
	public static void oddOccurences(int[] arr)
	{
		int length = arr.length;
		int check = 0;
		for(int i=0;i<length;i++)
		{
			check^=arr[i];
		}
		System.out.println(check);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,4,2,5,3,1,4,2,3,3,5};
		oddOccurences(arr);
	}

}

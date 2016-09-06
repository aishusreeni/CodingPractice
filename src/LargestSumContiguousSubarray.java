
public class LargestSumContiguousSubarray {
	
	public static void findLargestSubarray(int[] arr)
	{
		int sum_last_index = 0;
		int max_till_now = 0;
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			sum_last_index+=arr[i];
			System.out.println(sum_last_index);
			if(sum_last_index<0)
				sum_last_index=0;
			if(sum_last_index>max_till_now)
				max_till_now = sum_last_index;
		}
		System.out.println(max_till_now+" ");
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,4,2,-1,4,-15,3,6,-3};
		findLargestSubarray(arr);
	}

}

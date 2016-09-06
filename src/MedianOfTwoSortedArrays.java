
public class MedianOfTwoSortedArrays {
	
	public static void findMedian(int[] arr1, int[] arr2)
	{
		int median1, median2;
		int length1 = arr1.length;
		int length2 = arr2.length;
		int low1 = 0, low2 = 0;
		int high1 = length1-1, high2 = length2-1;
		while(true)
		{
			median1 = (int) Math.ceil((low1+high1)/2);
			median2 = (int) Math.ceil((low2+high2)/2);
			if(arr1[median1]==arr2[median2])
			{
				System.out.println("="+arr1[median1]);
				return;
			}
			if(arr1[median1]>arr2[median2])
			{
				high1 = median1;
				low2 = median2;
				System.out.println(">"+high1+" "+low2);
			}
			else
			{
				low1 = median1;
				high2 = median2;
				System.out.println("<"+low1+" "+high2);
			}
			if((low1+1==high1)&&(low2+1==high2))
			{
				System.out.println(low1+" "+high1+" "+low2+" "+high2);
				int max = Math.max(arr1[low1], arr2[low2]);
				int min = Math.min(arr1[high1], arr2[high2]);
				float res = (min+max);
				System.out.println(res/2);
				return;
			}
			if(low1==high1 && low2==high2)
			{
				System.out.println("1 elt"+((arr1[low1]+arr2[low2])/2));
				return;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = {1, 12, 15, 26, 38};
		int[] arr2 = {2, 13, 17, 30, 45};
		findMedian(arr1,arr2);
	}

}

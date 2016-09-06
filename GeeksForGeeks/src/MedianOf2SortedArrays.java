
public class MedianOf2SortedArrays {
	
	public static void findMedian(int[] arr1, int[] arr2)
	{
		int length = arr1.length;
		int low1 = 0,high1 = length-1,low2=0,high2=length-1;
		int mid1=0, mid2=0;
		while(true)
		{
			mid1 = (high1-low1)/2;
			mid2 = (high2-low2)/2;
			if(arr1[mid1]>arr2[mid2])
			{
				high1=mid1;
				low2=mid2;
			}
			else if(arr1[mid1]==arr2[mid2])
			{
				System.out.println(arr1[mid1]);
				break;
			}
			else
			{
				low1=mid1;
				high2=mid2;
			}
		}
	}

}

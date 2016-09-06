
public class SearchElementInSortedAndRotatedArray {
	
	public static void search(int[] arr, int elt)
	{
		int length = arr.length;
		int low = 0;
		int high = length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			System.out.println(mid);
			if(arr[mid]==elt)
			{
				System.out.println("found at "+(mid+1));
				return;
			}
			if(arr[low]<=arr[mid])
			{
				if(elt<=arr[mid] && elt>=arr[low])
				{
					high=mid-1;
					continue;
				}
				else
				{
					low=mid+1;
					continue;
				}
			}
			if(elt>=arr[mid] && elt<=arr[high])
				low = mid+1;
			else
				high=mid-1;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		search(arr,3);
	}

}

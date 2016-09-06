
public class MaxProdOf3ElementsInArray {
	
	public static void maxPositive(int[] arr)
	{
		int max1p = 0, max2p = 0, max3p = 0, length = arr.length;
		int min1p = 0, min2p = 0;
		for(int i=0;i<length;i++)
		{
			if(arr[i]>0)
			{
				if(arr[i]>max1p)
					max1p = arr[i];
				if(arr[i]<max1p && arr[i]>max2p)
					max2p = arr[i];
				if(arr[i]<max2p && arr[i]>max3p)
					max3p = arr[i];
			}
			else
			{
				if(arr[i]<min1p)
					min1p = arr[i];
				if(arr[i]>min1p && arr[i]<min2p)
					min2p = arr[i];
			}
		}
		int max = Math.max(max1p*max2p*max3p, min1p*min2p*max1p);
		System.out.println(max+" "+"="+" "+max1p+" "+max2p+" "+max3p+" "+min1p+" "+min2p);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,4,2,3,-7,-5,4,2};
		maxPositive(arr);
	}

}


public class MaxProductSoFar {
	
	public static void maxSoFar(int[] arr)
	{
		int maxSoFar = 1;;
		int length = arr.length;
		int currMax=1, currMin=1;
		for(int i=0;i<length;i++)
		{
			if(arr[i]>0)
			{
				currMax *= arr[i];
				currMin = Math.min(currMin*arr[i],1);
			}
			else if(arr[i]==0)
			{
				currMax = 1;
				currMin = 1;
			}
			else
			{
				int temp = currMax;
				currMax = Math.max(currMin*arr[i], 1);
				currMin = temp*arr[i];
			}
			if(maxSoFar<currMax)
				maxSoFar=currMax;
		}
		System.out.println(maxSoFar);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,-2,-3,0,7,-8,-2};
		maxSoFar(arr);
	}

}

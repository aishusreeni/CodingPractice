/*Given an array of integers, update the index with multiplication of previous and next integers,

   e.g. Input: 2 , 3, 4, 5, 6
        Output: 2*3, 2*4, 3*5, 4*6, 5*6*/

public class BeforeAfterProductArray {
	
	public static void product(int[] arr)
	{
		int length = arr.length;
		int temp = arr[0],i=0;
		arr[0] = arr[0]*arr[1];
		for(i=1;i<length-1;i++)
		{
			int tnew = arr[i];
			arr[i] = temp*arr[i+1];
			temp = tnew;
		}
		arr[i] = temp*arr[i];
		
		for(i=0;i<length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2, 3, 4, 5, 6};
		product(arr);
	}

}

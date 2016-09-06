
public class ReverseArrayOrString {
	
	public static void reverse(int[] arr)
	{
		int length=arr.length;
		for(int i=0,j=length-1; i<j; ++i,--j)
		{
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2,3,6,10,11};
		reverse(arr);
	}

}

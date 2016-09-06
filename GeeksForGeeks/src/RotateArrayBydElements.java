
public class RotateArrayBydElements {
	
	public static void rotate(int[] arr, int d)
	{
		int[] temp = new int[10];
		int i;
		for(i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
		int j;
		int length = arr.length;
		for(j=0;i<length;j++)
		{
			arr[j] = arr[i];
			i++;
		}
		for(i=0;i<d;i++)
		{
			arr[j]=temp[i];
			j++;
		}
		
		//display
		for(i=0;i<length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		rotate(arr,2);
	}

}

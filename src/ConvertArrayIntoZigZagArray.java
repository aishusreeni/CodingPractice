
public class ConvertArrayIntoZigZagArray {
	
	public static void convert(int[] arr)
	{
		int length = arr.length;
		for(int i=1;i<length;i++)
		{
			if(arr[i-1]>arr[i])
			{
				int temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}
			i++;
			for(int j=0;j<length;j++)
				System.out.print(arr[j]+" ");
			System.out.println();
			if(i==length)
				break;
			if(arr[i-1]<arr[i])
			{
				int temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}
			i++;
			for(int j=0;j<length;j++)
				System.out.print(arr[j]+" ");
			System.out.println();
		}
		for(int i=0;i<length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,6,1};
		convert(arr);
	}

}

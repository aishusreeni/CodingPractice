
public class MergeArrayIntoAnotherArrayOfSizemplusn {
	
	public static void moveToEnd(int[] arr)
	{
		int j=arr.length-1;
		int length = arr.length;
		for(int i=length-1;i>=0;--i)
		{
			if(arr[i]!=-1)
			{
				arr[j]=arr[i];
				--j;
			}
		}
	}
	
	public static void display(int[] arr)
	{
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void sort(int[] arr, int[] arrn)
	{
		int k = arrn.length;
		int lengthm = arr.length;
		int lengthn = arrn.length;
		int i,j;
		for(i=0,j=0; k<lengthm && j<lengthn; ++i)
		{
			System.out.println(arr[k]+" "+arrn[j]);
			if(arr[k]<=arrn[j])
			{
				arr[i]=arr[k];
				++k;
			}
			else
			{
				arr[i]=arrn[j];
				++j;
			}
			display(arr);
		}
		while(j<arrn.length)
		{
			arr[i]=arrn[j];
			++i;
			++j;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2, 8, -1, -1, -1, 13, -1, 15, 20};
		int[] arrnew = {5, 7, 9, 25};
		moveToEnd(arr);
		display(arr);
		sort(arr,arrnew);
		display(arr);
	}

}

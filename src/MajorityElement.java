
public class MajorityElement {
	
	public static void check(int[] arr,int x)
	{
		int length = arr.length;
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(arr[i]==x)
				++count;
		}
		if(count>(length/2))
			System.out.println(x);
		else
			System.out.println("none");
	}
	
	public static void findMajorityElement(int[] arr)
	{
		int count = 1, index = 0;
		int length = arr.length;
		for(int i=1; i<length;i++)
		{
			if(arr[i]==arr[index])
				++count;
			else
				--count;
			if(count==0)
			{
				count=1;
				index=i;
			}
		}
		System.out.println(arr[index]);
		check(arr,arr[index]);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2, 2, 3, 5, 5, 5, 5};
		findMajorityElement(arr);
	}

}

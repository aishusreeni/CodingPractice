
public class Heap {
	
	public static void maxHeapify(int[] arr, int i)
	{
		int l = 2*i;
		int r = 2*i+1;
		System.out.println("here");
		//System.out.println(arr[l]+" "+arr[r]);
		int largest = i;
		System.out.println("here");
		if(l<=arr.length-1 && arr[l]>arr[i])
			largest = l;
		if(r<=arr.length-1 && arr[r]>arr[largest])
			largest = r;
		System.out.println("largest: "+arr[largest]);
		if(largest!=i)
		{
			int temp = arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			System.out.println("c");
			largest=i;
			maxHeapify(arr,largest);
		}
	}
	
	public static void buildMaxHeap(int[] arr)
	{
		int length = (arr.length-1)/2;
		for(int i=length;i>0;i--)
		{
			System.out.println("here");
			maxHeapify(arr,i);
			System.out.println("here");
			display(arr);
		}
	}
	
	public static void display(int[] arr)
	{
		int length = arr.length;
		for(int i=0;i<length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] arr = {0,4,1,9,14,16,3,10,2,8,7};
		buildMaxHeap(arr);
		display(arr);
	}

}

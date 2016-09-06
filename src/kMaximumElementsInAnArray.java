import java.util.PriorityQueue;
import java.util.Queue;

public class kMaximumElementsInAnArray {
	
	public static void kMax(int[] arr, int k)
	{
		Queue<Integer> q = new PriorityQueue<Integer>();
		int length = arr.length;
		if(k>length)
		{
			System.out.println("bad scenario");
			return;
		}
		int i;
		for(i=0;i<k;i++)
		{
			q.add(arr[i]);
		}
		while(i<length)
		{
			System.out.println(i);
			if(arr[i]>q.peek())
			{
				q.remove();
				q.add(arr[i]);
			}
			i++;
		}
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {-1,-7,-3,-2};
		kMax(arr,3);
	}

}

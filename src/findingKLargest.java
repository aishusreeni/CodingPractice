import java.util.PriorityQueue;
import java.util.Queue;

public class findingKLargest {
	
	public static void findKLargest(int k, int[] arr)
	{
		Queue<Integer> q = new PriorityQueue<Integer>();
		int i=0;
		while(k>0)
		{
			q.add(arr[i]);
			--k;
			++i;
		}
		System.out.println(q.size());
		while(i<arr.length)
		{
			if(arr[i]>q.peek())
			{
				q.remove();
				q.add(arr[i]);
			}
			++i;
		}
		while(q.peek()!=null)
		{
			System.out.println(q.peek());
			q.remove();
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,15,2,4,3,7,6,33,8,23};
		findKLargest(8,arr);
	}

}

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class kMinimumElementsInAnArray {
	
	public static void kMin(int[] arr, int k)
	{
		Queue<Integer> q = new PriorityQueue<Integer>(
				new Comparator<Integer>()
				{
					public int compare(Integer i1, Integer i2) {
						// TODO Auto-generated method stub
						if(i1>i2)
							return 1;
						else
							return 0;
					}
				});
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
			if(arr[i]<q.peek())
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
		kMin(arr,3);
	}

}

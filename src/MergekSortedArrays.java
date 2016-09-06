import java.util.PriorityQueue;
import java.util.Queue;

public class MergekSortedArrays {
	
	public static void merging(int[][] arr,int m,int n)
	{
		int i = 0;
		int count = 0;
		Queue<Integer> q = new PriorityQueue<Integer>();
		while(count<m)
		{
			for(i=0;i<n;i++)
			{
				q.add(arr[count][i]);
			}
			++count;
		}
		while(q.peek()!=null)
		{
			System.out.print(q.poll()+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[][] arr = {{1,5,2,3},{4,1,5,2},{4,4,6,2}};
		merging(arr,3,4);
	}

}

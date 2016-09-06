import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsing1Queue {
	
	Queue<Integer> q = new LinkedList<Integer>();
	
	/*public void push(int data)
	{
		System.out.println("pushing:"+data);
		q.add(data);
		int size = q.size();
		System.out.println(q.size());
		while(size>1)
		{
			q.add(q.poll());
			System.out.println("peek:"+q.peek());
			size--;
		}
	}
	
	public void pop()
	{
		if(q.poll()==null)
		{
			System.out.println("error");
			return;
		}
		System.out.println("popping"+q.poll());
	}*/
	
	public void check()
	{
		q.add(1);
		q.add(2);
		q.add(q.poll());
		System.out.println(q.size());
		
	}
	
	public static void main(String[] args)
	{
		/*StackImplementationUsing1Queue obj = new StackImplementationUsing1Queue();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();*/
		StackImplementationUsing1Queue obj = new StackImplementationUsing1Queue();
		obj.check();
	}

}

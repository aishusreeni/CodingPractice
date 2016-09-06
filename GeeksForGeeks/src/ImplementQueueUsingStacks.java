import java.util.Stack;

public class ImplementQueueUsingStacks {
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public void push(int data)
	{
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		s1.push(data);
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
	}
	
	public int pop()
	{
		return s2.pop();
	}
	
	public static void main(String[] args)
	{
		ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		obj.push(5);
		obj.push(6);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	}
}

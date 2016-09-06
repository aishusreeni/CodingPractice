import java.util.Stack;

public class NextGreaterElement {
	
	static Stack<Integer> stack = new Stack<Integer>();

	public static void nextGreaterElement(int[] arr)
	{
		int length = arr.length;
		int i=0;
		int[] next = new int[length];
		next[length-1] = -1;
		stack.push(arr[length-1]);
		for(i=length-2;i>=0;i--)
		{
			int temp = stack.pop();
			if(temp>arr[i])
			{
				next[i] = temp;
				stack.push(temp);
			}
			else
			{
				int flag=0;
				while(!stack.isEmpty())
				{
					System.out.println("hello");
					temp = stack.pop();
					System.out.println(temp);
					if(temp>arr[i])
					{
						next[i] = temp;
						flag=1;
						break;
					}
				}
				if(stack.isEmpty() && flag==0)
					next[i] = -1;
				else
					stack.push(temp);
			}
			stack.push(arr[i]);
			System.out.println("size"+stack.size()+" " +stack.peek());
		}
		for(i=0;i<length;i++)
			System.out.print(next[i]+" ");
	}
	
	public static void main(String[] args)
	{
		int[] arr = {11,13,21,3};
		nextGreaterElement(arr);
	}
	
}

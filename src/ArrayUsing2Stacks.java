
public class ArrayUsing2Stacks {
	
	static int top1, top2, arr[], size;
	
	ArrayUsing2Stacks()
	{
		size=8;
		arr = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=0;
		top1 = -1;
		top2 = size-1;
	}
	
	public void push1(int data)
	{
		
		if(top1+1==top2)
			System.out.println("stack is full");
		else
			arr[++top1] = data;
	}
	
	public void push2(int data)
	{
		if(top1+1==top2)
			System.out.println("stack is full");
		else
			arr[top2--] = data;
	}
	
	public void pop1()
	{
		if(top1<0)
			System.out.println("stack is empty");
		else
			System.out.println(arr[--top1]);
	}
	
	public void pop2()
	{
		System.out.println(top2);
		if(top2>=size-1)
		{
			System.out.println("stack is empty");
			return;
		}
		else
			System.out.println(arr[++top2]);
	}
	
	public static void main(String[] args)
	{
		ArrayUsing2Stacks obj = new ArrayUsing2Stacks();
		obj.push1(0);
		obj.push1(0);
		obj.push1(0);
		obj.push1(0);
		obj.push1(0);
		obj.push1(0);
		obj.push2(1);
		obj.pop2();
		obj.pop2();
		obj.pop2();
	}

}

public class node{
	
	int data;
	node next;
	
	public node(int data)
	{
		this.data=data;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public node getNext()
	{
		return this.next;
	}
	
	public void setNext(node n)
	{
		this.next=n;
	}
	
}

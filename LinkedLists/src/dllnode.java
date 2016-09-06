public class dllnode {
	
	int data;
	dllnode next,prev;
	
	public dllnode(int data)
	{
		this.data=data;
		next=null;
		prev=null;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void setData(int data)
	{
		this.data=data;
	}
	
	public dllnode getPrev()
	{
		return this.prev;
	}
	
	public void setPrev(dllnode n)
	{
		this.prev=n;
	}
	
	public dllnode getNext()
	{
		return this.next;
	}
	
	public void setNext(dllnode n)
	{
		this.next=n;
	}
}



public class node {
	int data;
	char datac ;
	node left;
	node right;
	
	node(char datac)
	{
		this.datac=datac;
		this.left=null;
		this.right=null;
	}
	
	node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public char getDatac()
	{
		return this.datac;
	}
	
	public void setData()
	{
		this.data=data;
	}
	
	public void setDatac()
	{
		this.datac=datac;
	}
	
	public node getLeftChild()
	{
		return this.left;
	}
	
	public void setLeftChild(node left)
	{
		this.left=left;
	}
	
	public node getRightChild()
	{
		return this.right;
	}
	
	public void setRightChild(node right)
	{
		this.right=right;
	}

}

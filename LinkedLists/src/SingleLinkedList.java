public class SingleLinkedList {
	
	node head;
	
	SingleLinkedList()
	{
		head = null;
	}
	
	node getHead()
	{
		return head;
	}
	
	void traverse()
	{
		node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	void ListLength()
	{
		int length=0;
		node temp = head;
		while(temp!=null)
		{
			++length;
			//System.out.println(temp.getData());
			temp=temp.getNext();
		}
		System.out.println(length);
	}
	
	void insertBegin(int data)
	{
		node n = new node(data);
		n.setNext(head);
		head=n;
	}
	
	void insertEnd(int data)
	{
		node n = new node(data);
		if(head==null)
			head=n;
		else
		{
			node temp = head;
			while(temp.getNext()!=null)
				temp=temp.getNext();
			temp.setNext(n);
		}
	}
	
	void insertMiddle(int pos,int data)
	{
		if(pos==1)
			insertBegin(data);
		else
		{
			int position=1;
			node temp=head;
			while(pos!=position+1)
			{
				++position;
				temp=temp.getNext();
			}
			node n = new node(data);
			n.setNext(temp.getNext());
			temp.setNext(n);
		}
	}
	
	void deleteFirst()
	{
		if(head!=null)
			head=head.getNext();
	}
	
	void deleteLast()
	{
		node temp = head.getNext();
		node beforeTemp = head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
			beforeTemp=beforeTemp.getNext();
		}
		beforeTemp.setNext(null);
	}
	
	void deleteMiddle(int pos)
	{
		node temp = head.getNext();
		node beforeTemp = head;
		int position=2;
		while(position!=pos)
		{
			++position;
			temp=temp.getNext();
			beforeTemp=beforeTemp.getNext();
		}
		beforeTemp.setNext(temp.getNext());
	}
	
	public void nthFromEnd(int nval)
	{
		node n = head;
		node last = head;
		int count=1;
		while(count<nval)
		{
			last=last.getNext();
			++count;
		}
		while(last.getNext()!=null)
		{
			n=n.getNext();
			last=last.getNext();
		}
		System.out.println(nval+"th element is:"+n.getData());
	}
	
	public static void main(String[] args)
	{
		SingleLinkedList obj = new SingleLinkedList();
		obj.head = new node(1);
		node second = new node(2);
		node third = new node(3);
		node fourth = new node(4);
		node fifth = new node(5);
		node sixth = new node(6);
		obj.head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(sixth);
		System.out.println("traverse");
		obj.traverse();
		System.out.println("insertBegin");
		obj.insertBegin(8);
		System.out.println("deleteLast");
		obj.deleteLast();
		System.out.println("insertMiddle");
		obj.insertMiddle(3, 15);
		System.out.println("traverse");
		obj.traverse();
		System.out.println("deleteMiddle");
		obj.deleteMiddle(4);
		System.out.println("deleteFirst");
		obj.deleteFirst();
		System.out.println("traverse");
		obj.traverse();
		System.out.println("ListLength");
		obj.ListLength();
		System.out.println("insertEnd");
		obj.insertEnd(90);
		System.out.println("traverse");
		obj.traverse();
		System.out.println("end");
		obj.nthFromEnd(5);
	}
	
}
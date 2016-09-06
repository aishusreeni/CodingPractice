
public class DLL {
	
	dllnode head;
	int length;
	
	DLL()
	{
		head=null;
		length=6;
	}
	
	void traverse()
	{
		dllnode temp = head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	
	void ListLength()
	{
		System.out.println(length);
	}
	
	void insertFront(int data)
	{
		dllnode n = new dllnode(data);
		n.setNext(head);
		head=n;
		++length;
	}
	
	void insertEnd(int data)
	{
		dllnode n = new dllnode(data);
		dllnode temp = head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(n);
		n.setPrev(temp);
		++length;
	}
	
	void insertMiddle(int pos, int data)
	{
		System.out.println(length);
		if(pos>length)
			return;
		System.out.println("dint cross");
		dllnode n = new dllnode(data);
		dllnode temp = head.getNext();
		dllnode beforeTemp = head;
		int position=2;
		while(position!=pos)
		{
			System.out.println(position);
			temp=temp.getNext();
			beforeTemp=beforeTemp.getNext();
			++position;
		}
		beforeTemp.setNext(n);
		n.setPrev(beforeTemp);
		System.out.println("here");
		n.setNext(temp);
		temp.setPrev(n);
		++length;
	}
	
	void deleteFront()
	{
		head=head.getNext();
		head.setPrev(null);
		--length;
	}
	
	void deleteEnd()
	{
		dllnode temp = head.getNext();
		dllnode beforeTemp = head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
			beforeTemp = beforeTemp.getNext();
		}
		beforeTemp.setNext(null);
		--length;
	}
	
	void deleteMiddle(int pos)
	{
		dllnode temp = head;
		int position=1;
		while(pos!=position)
		{
			temp=temp.getNext();
			++position;
		}
		temp.setData(temp.getNext().getData());
		temp.setNext(temp.getNext().getNext());
		temp.getNext().getNext().setPrev(temp);
		--length;
	}
	
	public static void main(String[] args)
	{
		DLL obj = new DLL();
		obj.head = new dllnode(1);
		dllnode second = new dllnode(2);
		dllnode third = new dllnode(3);
		dllnode fourth = new dllnode(4);
		dllnode fifth = new dllnode(5);
		dllnode sixth = new dllnode(6);
		obj.head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(sixth);
		System.out.println("traverse");
		obj.traverse();
		System.out.println("insertBegin");
		obj.insertFront(8);
		System.out.println("traverse");
		obj.traverse();
		System.out.println("deleteLast");
		obj.deleteEnd();
		System.out.println("traverse");
		obj.traverse();
		System.out.println("insertMiddle");
		obj.insertMiddle(3, 15);
		System.out.println("traverse");
		obj.traverse();
		System.out.println("deleteMiddle");
		obj.deleteMiddle(4);
		System.out.println("traverse");
		obj.traverse();
		System.out.println("deleteFirst");
		obj.deleteFront();
		System.out.println("traverse");
		obj.traverse();
		System.out.println("ListLength");
		obj.ListLength();
		System.out.println("insertEnd");
		obj.insertEnd(90);
		System.out.println("traverse");
		obj.traverse();
		System.out.println("end");
	}

}
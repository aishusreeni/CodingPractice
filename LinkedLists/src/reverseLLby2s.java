
public class reverseLLby2s {
	
	static node reverse(node head)
	{
		if(head==null || head.getNext()==null)
		{
			System.out.println(head.getData());
			return head;
		}
		node one = head;
		node two = head.next;
		node prev = null;
		node temp=two;
		//int count=1;
		
		while( one!=null && two!=null &&two.getNext()!=null)
		{
			System.out.print("hey"+one.getData()+" "+two.getData());
			//System.out.println();
			one.setNext(two.getNext());
			two.setNext(one);
			if(prev!=null)
				prev.setNext(two);
			prev=one;
			one=one.getNext();
			if(one.getNext()!=null)
				two=one.getNext();
			else
				two=null;
			//System.out.println(prev.getData()+" "+one.getData()+" "+two.getData());
			//++count;
		}
		return temp;
	}
	
	static void traverse(node head)
	{
		node temp = head;
		System.out.println("here");
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		node first = new node(1);
		node sec = new node(2);
		node third = new node(3);
		node fourth = new node(4);
		node fifth = new node(5);
		node sixth = new node(6);
		node sev = new node(7);
		first.setNext(sec);
		sec.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(sixth);
		sixth.setNext(sev);
		sev.setNext(null);
		first=reverse(first);
		traverse(first);
	}

}

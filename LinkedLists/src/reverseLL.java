
public class reverseLL {
	
	public static node reverse(node head)
	{
		node prev= null;
		node curr = head;
		while(curr!=null)
		{
			node nex = curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=nex;
		}
		return prev;
	}
	
	static void traverse(node head)
	{
		node temp = head;
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
		first.setNext(sec);
		sec.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(null);
		first=reverse(first);
		traverse(first);
	}

}

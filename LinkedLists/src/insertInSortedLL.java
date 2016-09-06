
public class insertInSortedLL {
	
	public static void insert(int data, node head)
	{
		node n1 = head;
		node n2 = head.getNext();
		while(n2!=null && n2.getData()<data)
		{
			n1=n1.getNext();
			n2=n2.getNext();
		}
		node n = new node(data);
		n1.setNext(n);
		n.setNext(n2);
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
		insert(3,first);
		traverse(first);
	}
	
}

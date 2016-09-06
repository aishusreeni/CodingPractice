
public class PrintLLFromEnd {
	
	static void printFromEnd(node head)
	{
		if(head==null)
		{
			return;
		}
		printFromEnd(head.getNext());
		System.out.println(head.getData());
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
		printFromEnd(first);
	}

}

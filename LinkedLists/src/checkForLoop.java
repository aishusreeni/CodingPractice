import java.util.HashMap;
import java.util.Map;

public class checkForLoop {
	
	public static void check(node head)
	{
		node fast = head.getNext().getNext(), slow = head;
		while(fast!=slow && fast.getNext()!=null && fast.getNext().getNext()!=null && fast!=null)
		{
			fast=fast.getNext().getNext();
			slow=slow.getNext();
		}
		if(fast==slow)
			System.out.println("there is a loop");
		else
			System.out.println("no loop");
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
		fifth.setNext(first);
		check(first);
	}
}

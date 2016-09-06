
public class MidOfLL {
	
	static void findMid(node head)
	{
		node slow = head, fast = head;
		while(fast!=null && fast.getNext()!=null && fast.getNext().getNext()!=null)
		{
			slow=slow.getNext();
			fast=fast.getNext().getNext();
		}
		System.out.println("mid element is : "+slow.getData());
	}

	public static void main(String[] args)
	{
		node first = new node(1);
		node sec = new node(2);
		node third = new node(3);
		first.setNext(sec);
		sec.setNext(third);
		third.setNext(null);
		findMid(first);
	}
	
}


public class CheckLLPalindrome {

	static void check(node head)
	{
		node temp = head;
		int count=0;
		while(temp!=null)
		{
			++count;
			temp=temp.getNext();
		}
		System.out.println("count"+count);
		if(count%2==0)
			count/=2;
		else
			count=(count/2)+1;
		temp=head;
		System.out.println(count);
		while(count>0)
		{
			temp=temp.getNext();
			--count;
		}
		System.out.println(temp.getData());
		temp=reverseLL.reverse(temp);
		System.out.println("temp"+temp.getData()+ " "+temp.getNext().getData());
		node tempcheck = head;
		while(temp!=null)
		{
			System.out.println("temp"+temp.getData()+ " "+tempcheck.getData());
			if(tempcheck.getData()!=temp.getData())
			{
				System.out.println("not equal");
				return;
			}
			temp=temp.getNext();
			tempcheck=tempcheck.getNext();
		}
		System.out.println("yess");
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
		node fourth = new node(2);
		node fifth = new node(1);
		first.setNext(sec);
		sec.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(null);
		check(first);
		traverse(first);
	}
	
}

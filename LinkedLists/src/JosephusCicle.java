public class JosephusCicle
{
	public static void eliminate(node head, int m,int n)
	{
		node temp = head;
		node tempn = head.getNext();
		int count = 1;
		while(tempn!=null && tempn.getNext()!=null)
		{
			++count;
			if(count==m)
			{
				System.out.println(tempn.getData());
				temp.setNext(tempn.getNext());
				count=1;
				temp=temp.getNext();
				tempn=temp.getNext();
				--n;
			}
			if(n==0)
				break;
			System.out.println(temp.getData());
		}
		System.out.println(tempn.getData());
	}
	
	public static void main(String[] args)
	{
		node first = new node(1);
		node sec = new node(2);
		node third = new node(3);
		node fourth = new node(4);
		node fifth = new node(5);
		node sixth = new node(6);
		first.setNext(sec);
		sec.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(sixth);
		sixth.setNext(first);
		eliminate(first,2,6);
	}
}
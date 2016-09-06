import java.util.HashSet;
import java.util.Set;

public class findMergingPointLL {
	
	public static void check(node head1, node head2)
	{
		node temp1=head1;
		node temp2=head2;
		int length1=1,length2=1;
		while(temp1!=null)
		{
			++length1;
			temp1=temp1.getNext();
		}
		while(temp2!=null)
		{
			++length2;
			temp2=temp2.getNext();
		}
		int diff=0;
		temp1=head1;
		temp2=head2;
		if(length1>length2)
		{
			diff = length1-length2;
			while(diff>0)
			{
				temp1=temp1.getNext();
				--diff;
			}
		}
		else
		{
			diff=length2-length1;
			while(diff>0)
			{
				temp2=temp2.getNext();
				--diff;
			}
		}
		while(temp1!=temp2)
		{
			temp1=temp1.getNext();
			temp2=temp2.getNext();
		}
		System.out.println(temp1.getData()+"is the intersection");
	}
	
	public static void main(String[] args)
	{
		node first1 = new node(5);
		node sec1 = new node(6);
		node third1 = new node(2);
		node fourth1 = new node(1);
		node fifth1 = new node(2);
		first1.setNext(sec1);
		sec1.setNext(third1);
		third1.setNext(fourth1);
		fourth1.setNext(fifth1);
		fifth1.setNext(null);
		
		node first2 = new node(2);
		node sec2 = new node(18);
		node third2 = new node(3);
		first2.setNext(sec2);
		sec2.setNext(third2);
		third2.setNext(third1);
		
		check(first1,first2);
	}

}

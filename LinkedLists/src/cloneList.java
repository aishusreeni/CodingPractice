import java.util.HashMap;
import java.util.Map;

class clonenode
{
	int data;
	clonenode next;
	clonenode random;
	clonenode(int data)
	{
		this.data=data;
	}
}

public class cloneList {
	
	public static void traverse(clonenode head)
	{
		clonenode temp = head;
		while(temp!=null)
		{
			if(temp.next==null)
				break;
			System.out.print("data: "+temp.data+" next :"+temp.next.data+" random : "+temp.random.data);
			System.out.println();
			temp=temp.next;
		}
		System.out.println("data: "+temp.data+" random : "+temp.random.data);
	}
	
	public static void clone(clonenode head)
	{
		Map<clonenode,clonenode> map = new HashMap<clonenode,clonenode>();
		clonenode temp = head;
		while(temp!=null)
		{
			clonenode newnode = new clonenode(temp.data);
			newnode.next=null;
			newnode.random=null;
			map.put(temp,newnode);
			temp=temp.next;
		}
		System.out.println("map done");
		temp=head;
		while(temp!=null)
		{
			clonenode n = map.get(temp);
			n.next = map.get(temp.next);
			n.random = map.get(temp.random);
			temp=temp.next;
			System.out.println("cloning");
		}
		System.out.println(map.get(head).random.data);
		traverse(map.get(head));
		
	}
	
	public static void main(String[] args)
	{
		clonenode first = new clonenode(1);
		clonenode sec = new clonenode(2);
		clonenode third = new clonenode(3);
		clonenode fourth = new clonenode(4);
		clonenode fifth = new clonenode(5);
		first.next=sec;
		sec.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=null;
		first.random=fifth;
		sec.random=fourth;
		third.random=sec;
		fourth.random=first;
		fifth.random=third;
		clone(first);
	}

}

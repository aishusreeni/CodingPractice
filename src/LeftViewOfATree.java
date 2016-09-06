import java.util.HashSet;
import java.util.Set;

public class LeftViewOfATree {

	static Set<Integer> hash = new HashSet<Integer>();
	
	public static void leftView(node root, int height)
	{
		if(root!=null)
		{
			if(!hash.contains(height))
			{
				System.out.println(root.data);
				hash.add(height);
			}
			if(root.left!=null)
				leftView(root.left,height+1);
			if(root.right!=null)
				leftView(root.right,height+1);
		}
		
	}
	
	public static void main(String[] args)
	{
		node n1 = new node(1);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		node n5 = new node(5);
		node n6 = new node(6);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		n5.left = n6;
		leftView(n1,0);
	}
	
}

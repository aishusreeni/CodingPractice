
public class InorderSuccessorInABST 
{
	public static node searchRight(node n, node rem)
	{
		if(n!=null)
		{
			node m = searchRight(n.left,n);
		}
		return rem;
	}
	
	public static node searchN(node root, node n)
	{
		node succ=null;
		while(root!=null)
		{
			if(n.data<root.data)
			{
				succ = root;
				root=root.left;
			}
			else if(n.data>root.data)
				succ=root.right;
			else
				break;
		}
		return succ;
	}
	
	public static void inorder(node root, node n)
	{
		if(n.right!=null)
			System.out.println(searchRight(n.right,n));
		else
			System.out.println(searchN(root,n));
	}
	
	public static void main(String[] args)
	{
			node n1 = new node(10);
			node n2 = new node(5);
			node n3 = new node(11);
			node n4 = new node(-5);
			node n5 = new node(8);
			node n6 = new node(20);
			node n7 = new node(6);
			node n8 = new node(9);
			n1.left=n2;
			n1.right=n3;
			n2.left=n4;
			n2.right=n5;
			n3.right=n6;
			n5.left=n7;
			n5.right=n8;
			inorder(n1,n4);
	}
}

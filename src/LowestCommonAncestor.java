
public class LowestCommonAncestor {
	
	public static boolean searchLeftSubtree(node root, node m)
	{
		if(root.data==m.data)
		{
			System.out.println(root.data+" is present!");
			return true;
		}
		boolean left=false;
		boolean right=false;
		if(root.left!=null)
			left = searchLeftSubtree(root.left,m);
		if(root.right!=null)
			right = searchLeftSubtree(root.right,m);
		return left||right;
	}
	
	public static node findCommonAncestor(node root, node m, node n)
	{
		if(root.data==m.data || root.data==n.data)
			return root;
		boolean searchmLeft = searchLeftSubtree(root.left,m);
		boolean searchnLeft = searchLeftSubtree(root.left,n);
		if(root.left!=null && searchmLeft && searchnLeft)
			return findCommonAncestor(root.left,m,n);
		else if(root.left!=null && root.right!=null && 
				((searchmLeft && !searchnLeft) || (!searchmLeft && searchnLeft)))
		{
			System.out.println("here");
			return root;
		}
		else if(root.right!=null)
			return findCommonAncestor(root.right,m,n);
		else
			return null;
	}
	
	public static void main(String[] args)
	{
		node n1 = new node(1);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		node n5 = new node(5);
		node n6 = new node(6);
		node n7 = new node(7);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		System.out.println(findCommonAncestor(n1,n4,n7).data);
	}

}

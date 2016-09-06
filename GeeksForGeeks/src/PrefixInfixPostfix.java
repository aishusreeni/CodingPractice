
public class PrefixInfixPostfix {
	
	public static void prefix(node root)
	{
		if(root!=null)
			System.out.print(root.data+" ");
		if(root.left!=null)
			prefix(root.left);
		if(root.right!=null)
			prefix(root.right);
	}
	
	public static void postfix(node root)
	{
		if(root.left!=null)
			postfix(root.left);
		if(root.right!=null)
			postfix(root.right);
		if(root!=null)
			System.out.print(root.data+" ");
	}
	
	public static void infix(node root)
	{
		if(root.left!=null)
			infix(root.left);
		if(root!=null)
			System.out.print(root.data+" ");
		if(root.right!=null)
			infix(root.right);
	}
	
	public static void main(String[] args)
	{
		node level1 = new node(1);
		node level2l = new node(2);
		node level2r = new node(3);
		node level3l = new node(4);
		node level3r = new node(5);
		level1.left=level2l;
		level1.right=level2r;
		level2l.left=level3l;
		level2l.right=level3r;
		prefix(level1);
		System.out.println();
		postfix(level1);
		System.out.println();
		infix(level1);
		System.out.println();
	}

}

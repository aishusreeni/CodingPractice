
public class HeightOfBinaryTree {
	
	public static int findHeight(node root)
	{
		if(root==null)
			return 0;
		else
		{
			int lheight = findHeight(root.left);
			int rheight = findHeight(root.right);
			if(lheight>rheight)
				return lheight+1;
			else
				return rheight+1;
		}
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
		System.out.println(findHeight(level1));
	}

}

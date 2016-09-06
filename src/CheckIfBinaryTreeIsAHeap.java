
public class CheckIfBinaryTreeIsAHeap {
	
	public static boolean check(node root)
	{
		boolean val = false;
		if(root==null)
			return true;
		else
		{
			if(root.left!=null && root.left.data<root.data)
				val = true;
			if(root.right!=null && root.right.data<root.data)
				val = true;
			return check(root.left)&&check(root.right);
		}
	}

}

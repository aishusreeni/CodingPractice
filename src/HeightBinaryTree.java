
public class HeightBinaryTree {
	
	public static int check(node root)
	{
		if(root==null)
			return 0;
		int left = check(root.left);
		int right = check(root.right);
		if(left == -1 || right == -1)
			return -1;
		if(Math.abs(left-right)>1)
			return -1;
		else
			return Math.max(left, right)+1;
	}
	
	public static boolean isBalanced(node root)
	{
		if(root==null)
			return true;
		if(check(root)==-1)
			return false;
		else
			return true;
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
			System.out.println(isBalanced(n1));
	}

}

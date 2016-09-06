public class CheckIfBinaryTreeIsABST
{
	public static boolean check(node root, int min, int max)
	{
		boolean val = false;
		if(root==null)
			return true;
		if(root.data>min && root.data<max)
			val = true;
		else
			return false;
		val = check(root.left,min,root.data)&&check(root.right,root.data,max);
		return val;
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
			System.out.println(check(n1,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}
}

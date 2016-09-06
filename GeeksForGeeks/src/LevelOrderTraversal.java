import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	static Queue<node> q = new LinkedList<node>();

	public static void levelOrder()
	{
		while(!q.isEmpty())
		{
			node n = q.poll();
			System.out.println(n.data+" ");
			if(n.left!=null)
				q.add(n.left);
			if(n.right!=null)
				q.add(n.right);
		}
	}
	
	public static void printInOrder(node root)
	{
		if(root==null)
			return;
		q.add(root);
		levelOrder();
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
		printInOrder(level1);
	}
	
}

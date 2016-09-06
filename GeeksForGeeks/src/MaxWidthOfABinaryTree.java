import java.util.HashMap;
import java.util.Map;

public class MaxWidthOfABinaryTree {
	
	static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	public static void maxWidth(node root, int height)
	{
		if(root==null)
			return;
		
		if(map.containsKey(height))
		{
			map.put(height,map.get(height)+1);
		}
		else
			map.put(height,1);
		
		maxWidth(root.left,height+1);
		maxWidth(root.right,height+1);
	}
	
	public static int calMax(node root)
	{
		if(root==null)
			return 0;
		maxWidth(root,0);
		int length = map.size();
		int max = 1;
		for(int i=0;i<length;i++)
		{
			System.out.println(map.get(i));
			if(map.get(i)>max)
				max = map.get(i);
		}
		return max;
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
		System.out.println("max:"+calMax(n1));
	}

}

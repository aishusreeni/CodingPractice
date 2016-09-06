import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {
	
	static Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
	static Queue<node> q = new LinkedList<node>();
	
	public static void bottomView(node root, int hd)
	{
		if(root==null)
			return;
		else
		{
			q.add(root);
		if(root.left!=null)
			q.add(root.left);
		if(root.right!=null)
			q.add(root.right);
		}
		/*if(!map.containsKey(hd))
			map.put(hd,root.data);
		else
			map.replace(hd,root.data);
		if(root.left!=null)
			bottomView(root.left,hd-1);
		if(root.right!=null)
			bottomView(root.right,hd+1);*/
	}
	
	public static void print(node root, int hd)
	{
		bottomView(root,hd);
		for(Integer key : map.keySet())
		{
			System.out.print(map.get(key)+" ");
		}
	}
	
	public static void main(String[] args)
	{
		node n1 = new node(20);
		node n2 = new node(8);
		node n3 = new node(22);
		node n4 = new node(5);
		node n5 = new node(3);
		node n6 = new node(25);
		node n7 = new node(10);
		node n8 = new node(14);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.right=n6;
		n5.left=n7;
		n5.right=n8;
		print(n1,0);
	}

}

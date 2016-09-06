
public class BuildTreeWithInorderPreOrder {
	
	static int preIndex=0;
	
	public static node build(node root,String pre, String in)
	{
		if(preIndex>=pre.length())
			return null;
		root = new node(pre.charAt(preIndex));
		System.out.println(root.data);
		int k=0,length=in.length();
		System.out.println(preIndex);
		while(k<length)
		{
			if(in.charAt(k)==pre.charAt(preIndex))
				break;
			k++;
		}
		System.out.println(in+""+k);
		preIndex++;
		if(length==1)
		{
			root.left=null;
			root.right=null;
			return root;
		}
		root.left=build(null,pre,in.substring(0,k));
		root.right=build(null,pre,in.substring(k+1,length));
		return root;	
	}
	
	public static void inOrder(node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.datac);
		inOrder(root.right);
	}
	
	public static void main(String[] args)
	{
		node root = build(null,"ABDECF","DBEAFC");
		inOrder(root);
	}
}



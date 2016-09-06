
public class RemoveUnnecessarySpacesInASentence {
	
	public static void remove(String str)
	{
		StringBuilder res = new StringBuilder();
		int length = str.length();
		int i=0;
		while(i<length)
		{
			if(str.charAt(i)!=' ')
			{
				res.append(str.charAt(i));
				++i;
			}
			else
			{
				while(str.charAt(i)==' ')
					i++;
				res.append(' ');
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args)
	{
		remove("hi   this is   aish");
	}

}

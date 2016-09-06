
public class CheckNumberDifferencesBetweenBitsOfAllPairs {
	
	public static String convert(int n)
	{
		int flag = 1;
		String str = "";
		
		if(n<0)
		{
			flag = 0;
			n=n*(-1);
		}
		
		while(n>0)
		{
			//System.out.println(n+" "+str);
			str+=n%2;
			n=n/2;
		}
		
		String res="";
		int length = str.length();

		for(int j=length-1;j>=0;j--)
		{
			res+=str.charAt(j);
		}
		
		return res;
	}
	
	public static void check(int[] n)
	{
		int count = 0;
		for(int j=0;j<2;j++)
			for(int k=0;k<2;k++)
			{
				String str1 = convert(n[j]);
				String str2 = convert(n[k]);
				//System.out.println(str1+" "+str2);
				int length = str1.length();
				for(int i=0;i<length;i++)
				{
					if(str1.charAt(i) != str2.charAt(i))
						++count;
				}
			}
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2,3};
		check(arr);
	}

}

public class ConvertNumberIntoBinary {
	
	public static void convert(int n)
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
		
		System.out.println(res);
	}
	
	public static void main(String[] args)
	{
		convert(10);
	}

}

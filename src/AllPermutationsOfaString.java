
public class AllPermutationsOfaString
{
	public static void permutations(char[] ch, int index)
	{
		int length = ch.length;
		if(index==ch.length)
		{
			for(int i=0;i<length;i++)
				System.out.print(ch[i]);
			System.out.println();
			return;
		}
		for(int i=0;i<length;i++)
		{
			char temp = ch[i];
			ch[i] = ch[index];
			ch[index] = temp;
			permutations(ch,index+1);
			temp = ch[i];
			ch[i] = ch[index];
			ch[index] = temp;
		}
	}
	
	public static void main(String[] args)
	{
		char[] ch = {'a','b','c'};
		permutations(ch,0);
	}
}
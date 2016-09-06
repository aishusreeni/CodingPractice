import java.util.Stack;

public class InfixToPostfix {
	
	public static boolean isOperand(char i)
	{
		return ((i>='a' && i<='z')||(i>='A'&&i<='Z'));
	}
	
	public static int prec(char i)
	{
		switch(i)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		}
		return 0;
	}
	
	public static void itop(String infix)
	{
		String output="";
		Stack<Character> s = new Stack<Character>();
		int length = infix.length();
		for(int i=0;i<length;i++)
		{
			System.out.println(infix.charAt(i));
			if(isOperand(infix.charAt(i)))
			{
				output+=infix.charAt(i);
			}
			else
			{
				while(!s.isEmpty() && prec(infix.charAt(i))<=prec(s.peek()))
				{
					output+=s.pop();
				}
				s.push(infix.charAt(i));
			}
		}
		while(!s.isEmpty())
		{
			output+=s.pop();
		}
		System.out.println(output);
	}
	
	public static void main(String[] args)
	{
		String str = "a*b+a*c-d";
		itop(str);
	}

}

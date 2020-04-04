package stack_queues;
import java.util.Scanner;
import java.util.Stack;
public class Balanced_paranthesis 
{
	private static boolean check(String str)
	{
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='(' || c=='{' || c=='[')
			{
				st.push(c);
			}
			if(c==')' || c=='}' || c==']')
			{
				if(st.isEmpty())
				{
					st.push(c);
				}
				if(c==')' && st.peek()=='(')
				{
					st.pop();
				}
				if(c=='}' && st.peek()=='{')
				{
					st.pop();
				}
				if(c==']' && st.peek()=='[')
				{
					st.pop();
				}

			}
		}
	
		if(st.isEmpty())
		{
			return true;
		}
		else
		return false;
		
		}

	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) 
		{
			String str=s.nextLine();
			System.out.println(check(str));
		}

	}

}

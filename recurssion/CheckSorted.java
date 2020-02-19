package recurssion;

public class CheckSorted 
{
	public static boolean checkSorted(int input[])
	{
		if(input.length<=1)
		{
			return true;
		}
		int smallinput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallinput [i-1]=input[i];
		}
		boolean smallans=checkSorted(smallinput);
		if(!smallans)
		{
			return false;
		}
		if(input[0]<=input[1])
		{
			return true;
		}
		else
		{
		return false;
		}
	}
public static void main(String[] args) 
{
  int input[]= {1,2,3,6,9};
  System.out.println(checkSorted(input));
}

}

package backtracing;
import java.util.Scanner;
public class Return_Subset_sumto_k 
{
	public static int[][] subsets(int input[],int sum)
	{
		int ans[][]=new int[0][0]; //ans is 2d array (empty)
		int subArray[]=new int[input.length];
		helper(input,subArray,0,sum);
		return ans;
	}
	private static void helper(int arr[],int subArray[],int count,int sum)
	{
		if(count==arr.length)
		{
			if(sum(subArray)==sum)
			{
				print(subArray);
				System.out.println();
			}
			return;
		}
		subArray[count]=0;
		helper(arr,subArray,count+1,sum);
		subArray[count]=arr[count];
		helper(arr,subArray,count+1,sum);
	}
	private static void print(int arr[]) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	private static int sum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int size;
		try (Scanner s = new Scanner(System.in)) {
			size=s.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			int sum=s.nextInt();
			subsets(arr,sum);
		}
		System.out.println("hello");
	}

}

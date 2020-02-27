package recurssion;

public class mergeSort {
	static void mergesort(int input[],int si,int ei)
	{
		if(si==ei)
			return;
		int mid=(si+ei)/2;
		mergesort(input,si,mid);
		mergesort(input,mid+1,ei);
		mergesort(input,si,ei);
	}
	public static void help(int input[],int si,int ei)
	{
		int mid=(si+ei)/2;
		int ans[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei)
		{
			if(input[i]<input[j])
			{
				ans[k]=input[i];
				i++;
				k++;
			}
			else
			{
				ans[k]=input[j];
			k++;
			j++;
		}
	}
	while(i<=mid)
	{
		ans[k]=input[i];
		i++;
		k++;
	}
	while(j<=ei)
	{
		ans[k]=input[j];
		j++;
		k++;
	}
  for(int index=0;index<ans.length;index++)
  {
	  input[si+index]=ans[index];
  }
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,6,2,8,9,3};
		help(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

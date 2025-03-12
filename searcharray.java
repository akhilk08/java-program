import java.util.*;
class search
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int[] arr=new int[20];
		int i,n,search,count=0;
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("array elements are:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("Enter the element to be search:");
		search=s.nextInt();
		for(int j=0;j<n;j++)
		{
			if(search==arr[j])
			{
				System.out.println("Element found at the position "+(j+1));
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("Element not found!!");
	}
}

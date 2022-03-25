import java.util.Scanner;
public class ArrayModify {
	public static void main(String[] args)
	{
	int n;
	Scanner s = new Scanner(System.in);
	int[] intArr = {1,2,3,4,5,6,7,8,9,10};
	System.out.print("Enter number of elements : ");
	n = s.nextInt();
	int a[] = new int[n];
	System.out.print("Enter the array elements : ");
	for (int i = 0; i < n; i++)
	{
	a[i] = s.nextInt();
	}
	System.out.print("Enter elements to Modify :");
	int ele = s.nextInt();
	for (int i = 0; i < n; i++)
	{
		a[i] = s.nextInt();
		//System.out.println("Enter to modify : ");
	    if(a[i] == ele)
	   {
	    	
	       System.out.println("Element Found :"+ ele);
	    }
	}
	 
}
}
	
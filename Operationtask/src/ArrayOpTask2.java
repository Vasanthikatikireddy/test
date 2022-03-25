import java.util.Scanner;
//public class ArrayIndexOutOfBoundsException {

public class ArrayOpTask2 {
	public static void main(String[] args)
	{
	int n, pos, x;
	Scanner s = new Scanner(System.in);
	int[] Arr = {1,2,3,4,5,6,7,8,9,10};
	System.out.print("Enter no. of elements you want in array:");
	
	n = s.nextInt();
	
	
	
	int a[] = new int[n+1];
	//System.out.println("Enter all the elements:");
	for(int i = 0; i < n; i++)
	{
	a[i] = s.nextInt();
	}
	
	try {
	System.out.print("Enter the position where you want to insert element:");
	pos = s.nextInt();
	System.out.print("Enter the element you want to insert:");
	//}catch(ArrayIndexOutOfBoundsException e) {
	//}
	
	
	x = s.nextInt();
    /*for(int i = (n-1); i >= (pos-1); i++)
	{  
	a[i+1] = a[i];
	}
	//5*/
    a[pos-1] = x;
	System.out.print("After inserting:");
	} 
	catch(ArrayIndexOutOfBoundsException e) {
	}
	
	for(int i = 0; i < n; i++)
	{
	System.out.print(a[i]+"");
	}
	//System.out.print(a[n]);
}
}

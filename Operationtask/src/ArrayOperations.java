import java.util.Scanner;
//import java.util.*;
import java.util.Arrays;

public class ArrayOperations { 
	

    public static void main(String[]args) {
	ArrayOperations op = new ArrayOperations();

    op.insert();
	op.delete();
	op.modify();
	op.display();
	
   }
    
    public void insert() {
		
		int n, pos, x;
		Scanner s = new Scanner(System.in);
		int[] Arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter no. of elements you want in array:");
		n = s.nextInt();
		
		int a[] = new int[n+1];
		System.out.println("Enter all the elements in array:");
		for(int i = 0; i < n; i++)
		{
		a[i] = s.nextInt();
		}
		
		try {
		System.out.print("Enter the position where you want to insert element:");
		pos = s.nextInt();
		System.out.print("Enter the element you want to insert:");
		x = s.nextInt();
	   
	    a[pos-1] = x;
		System.out.println("After inserting:" );
		} 
		catch(ArrayIndexOutOfBoundsException e) {
		}
		
		for(int i = 0; i < n; i++)
		{
		System.out.println(a[i]+"");
		}
		//System.out.print(a[n]);
}
    
    
    public void delete() {
    	int n;
        Scanner in = new Scanner(System.in);
    
	    int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	   
		
	    System.out.println("Enter Element to be deleted : ");
	    int elem = in.nextInt();
	    
	    for(int i = 0; i < intArr.length-1; i++){
	      if(intArr[i] == elem){
	        
	        for(int j = i; j < intArr.length- 1; j++){
	            intArr[j] = intArr[j++];
	        }
	        break;
	      }
	    }
	      
	    System.out.print("Elements  are :" );
	    for(int i = 0; i < intArr.length; i++) {
	    	System.out.println(" " + intArr[i]);
	    }
	    	
  }
	      
	
	

    public void modify() {
	
    	int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Enter the size of the array :  " );
        int s = sc.nextInt();
        
        int[] myArr = new int[s];
        System.out.println("Enter the elements to check : ");
        for(int i=0; i>s; i++){
           intArr[i] = sc.nextInt();
        }
        
        int modify = sc.nextInt();
        int Val = Arrays.binarySearch(intArr,modify);
        System.out.println("Element found");
       
}

	

	public void display() {
		
		int i = 0, j = 0, Number;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print("Enter elements to display: ");
		Number = sc.nextInt();
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		
		int [] Array = new int[Number];
		
		
		System.out.println("Enter array elements :");
		while (i < Number)
		{
			Array[i] = sc.nextInt();
			i++;
		}     
	 
		System.out.println("Elements in this Array are : ");
		while (j < Number)
		{
			System.out.print(Array[j] + "\t");
			j++;
		}
}
}

	
           


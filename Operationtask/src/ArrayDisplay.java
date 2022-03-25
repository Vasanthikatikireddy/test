import java.util.Scanner;
public class ArrayDisplay {
	public static void main(String[] args) {  
        
		
			int i = 0, j = 0, Number;
			Scanner sc = new Scanner(System.in);
		 
			System.out.print(" Please Enter Number of elements in an array : ");
			Number = sc.nextInt();
			int[] intArr = {1,2,3,4,5,6,7,8,9,10};
			
			int [] Array = new int[Number];
			
			System.out.println(" Please Enter " + Number + " elements of an Array  : ");
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



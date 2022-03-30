import java.util.Scanner;
public class ArrayDelete {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    System.out.print("Enter Element to be deleted : ");
	    int elem = in.nextInt();
	    for(int i = 0; i < intArr.length-1; i++){
	      if(intArr[i] == elem){
	        // shifting elements
	        for(int j = i; j < intArr.length - 1; j++){
	            intArr[j] = intArr[j+1];
	        }
	        break;
	      }
	    }
	    System.out.println("Elements  are :" );
	    for(int i = 0; i < intArr.length; i++){
	    	System.out.print(" " + intArr[i]);
	    }                
	  }
	}



package project;
import java.util.Scanner;
public class NameCom {
	
	   public static void main(String[] args)
	   {
	      int number;
	      String str;
	      Scanner sc1 = new Scanner(System.in);
	      System.out.println("Please enter number of strings: ");
	      number = sc1.nextInt();
	      String[] names = new String[number];
	      Scanner sc2 = new Scanner(System.in);
	      System.out.println("Enter all strings: ");
	      for(int a = 0; a < number; a++)
	      {
	         names[a] = sc2.nextLine();
	      }
	      for(int a = 0; a < number; a++)
	      {
	         for(int b = a + 1; b < number; b++)
	         {
	            // java alphabetical sort
	            if(names[a].compareTo(names[b]) > 0)
	            {
	               str = names[a];
	               names[a] = names[b];
	               names[b] = str;
	            }
	         }
	      }
	      System.out.println("After sorting names in an alphabetical order: ");
	      for(int a = 0; a < number - 1; a++)
	      {
	         System.out.println(names[a] + ", ");
	      }
	      System.out.print(names[number - 1]);
	      sc1.close();
	      sc2.close();
	   }
	}



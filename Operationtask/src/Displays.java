import java.util.Scanner;

public class Displays {
	public static void main(String[] args) {
		int x;
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		for(int i=0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
	}

}

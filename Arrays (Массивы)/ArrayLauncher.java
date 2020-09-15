import java.util.Scanner;

public class ArrayLauncher {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myArray = new int[8];	
		
		System.out.println("Please enter 8 int elements");

		for(int j = 0; j < myArray.length; j++) {
			System.out.println("Next element");
			scanner.nextInt();
		}

		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Element #" + i + " = " + myArray[i]);
		}

	}
}

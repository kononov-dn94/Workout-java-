import java.util.Scanner;

public class ArrayLauncher {
	public static Scanner scanner = new Scanner(System.in);
	public static void  main(String[] args) {
		int[] myArray = {0, 100, 200, 300, 400, 500};
		/*int[] myArray = new int[6];
		myArray[0] = 0;
		myArray[1] = 100;
		myArray[2] = 200;
		myArray[3] = 300;
		myArray[4] = 400;
		myArray[5] = 500;*/
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Element #" + i + " = " + myArray);
		}
		
		System.out.println("Element 4 = " +myArray[4]);
		
		int[] myArray2 = new int[8];
		System.out.println("Please enter 8 int elements");
		for (int j = 0; j < myArray2.length; j++) {
			System.out.println("Next element");
			myArray2[j] = scanner.nextInt();
		}
		
		
	}
}

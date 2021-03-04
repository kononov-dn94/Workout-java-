import java.util.Scanner;

public class ArrayLauncher {
	public static Scanner scanner = new Scanner(System.in);
	public static void  main(String[] args) {
		
		int[] myArray = new int[8];
		System.out.println("Please enter 8 int elements");
		for (int j = 0; j < myArray.length; j++) {
			System.out.println("Next element");
			myArray[j] = scanner.nextInt();
		}
		
		int[] array = sort(myArray);
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element #" + i + " = " + myArray[i]);
		}		
	}
	
	public static int[] sort(int[] array) { 
	
		//Как скопировать наш массив?!
		/*копируем наш ранее созданный массив
		int[]myNewArray = new int[array.length];
		for(int i = 0; i<array.length; i++) {
			myNewArray[i] = array[i]
		}
		
		//или можно сделать так
		int[]myNewArray = Array.copyOf(array, array.length);*/
		
		//пузырьковая сортировка
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-1; j++) {
				//нужно отсортировать наши элементы от меньшего к большему, по этому нужно...
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
	}
}

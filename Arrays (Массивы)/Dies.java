import java.security.SecureRandom;

public class Dies {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom(); //с помощью данного класса будем получать какие-то значения
		int[] frequency = new int[7]; //массив, в котором будут хваниться выпавшие значения
		
		/*массив *int[] ferequency* ограничен 7-ю значениями, 
		поскольку нулевой эллемент массива не будет идентифицирован, 
		т.к. на игральном кубике такого значения нет*/
		
		for(int i = 0; i < 1000; i++) { //бросаем кубик 1000-у раз
			++frequency[1+random.nextInt(6)]; 

			/*в массив int[] frequency записываем случайное значение, 
			сгенерированное методом nextInt класса random,
			для того, чтобы исключить запись ноля - прибовляем к классу random единицу(1+random.nextInt(6))*/
		}

		for(int i = 1; i<frequency.length; i++) { //выводим результат 1000 бросков 
			System.out.println("Side "+i+" :"+frequency[i]);
		}

		multidimArrayLauncher();
	}

	private static void multidimArrayLauncher() {
		int[][] a = {{1,2}, 
			    {3,4,5,6}, 
			    {7,8,9}};//инициализируем двумерный массив
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

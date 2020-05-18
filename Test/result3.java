class result3 {
	int a;
	int b;
	
	public int getMultiplication() {
		int result;
		result = a * b;
		return result;
	}
}


class testResult {
	public static void main(String[] arg) {


		result3[] mass = new result3[5];
		
		for(int i = 0; i < 5; i++) { 
			mass[i] = new result3();
			mass[i].a = i;
			mass[i].b = i * 10;
			//заполнить ячейки массива через цикл			
			//заполнить переменные a = i и b = i * 10 для каждого объекта
			System.out.println(mass[i].a);
			System.out.println(mass[i].b);
			System.out.println();
		}

		//вызывает функцию умножения и записывает результать

		int[] massResult = new int[5];

		for(int y = 0; y < 5; y++) {
			massResult[y] = mass[y].getMultiplication(); //массив, который хранит результат умножения [5 элементов в данном примере] = массив объектов, хранящий значения переменных а и b.(ссылается на функцию класса result3) getMultiplication();
			System.out.println(massResult[y]);
		}

		//выводит залультат умножения вместе с множителем
		for(int x = 0; x < 5; x++) {
			//System.out.format("%d * %d = %d%n", mass[x].a, mass[x].b, massResult[x]);	
			System.out.println(mass[x].a + " * " + mass[x].b + " = " + massResult[x]);
		}
	}
}


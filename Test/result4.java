class result4 {
	int a;
	int b;
	int result;

	public void getMultiplication() {
		result = a * b;
	}
}


class testResult {
	public static void main(String[] arg) {


		result4[] mass = new result4[5];
		
		for(int i = 0; i < 5; i++) { 
			mass[i] = new result4();
			mass[i].a = i;
			mass[i].b = i * 10;
			//заполнить ячейки массива через цикл			
			//заполнить переменные a = i и b = i * 10 для каждого объекта
			System.out.println(mass[i].a);
			System.out.println(mass[i].b);
			System.out.println();
		}


		//вызывает функцию умножения и записывает результать
		for(int y = 0; y < 5; y++) {
			mass[y].getMultiplication();
			System.out.println(mass[y].result);
		}

		//выводит залультат умножения вместе с множителем
		for(int x = 0; x < 5; x++) {
			//System.out.format("%d * %d = %d%n", mass[x].a, mass[x].b, massResult[x]);	
			System.out.println(mass[x].a + " * " + mass[x].b + " = " + mass[x].result);
		}
	}
}


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
		
		/*for() {
			//вызывает функцию умножения и записывает результать
		}*/

		/*for() {
			//выводит залультат умножения вместе с множителем
		}*/
	}
}


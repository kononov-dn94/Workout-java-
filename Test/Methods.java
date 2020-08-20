public class Methods {
	public static void main (String[] args) {
		int result = calcRectangleSquare(5, 10); //принимаем возвращаемую переменную из метода calcRectangleSquare и записываем ее 								результат в другую переменную;
		System.out.println("Rectangle square = "+result);
							//calcRectangleSquare(5, 10); в метод можно передавать на прямую значения переменных
							/* или можно объявить пара константных переменных и передавать их
							int a = 5;
							int b = 10;
							при этом имена переменных могут не совпадать, главное, чтоб совпадал тип принемаемых 								параметров метода*/
		int result2 = calcSquare(5);
		System.out.println("Rectangle square = "+result2);

	}

	static int calcRectangleSquare(int x, int y) {  //метод нахождения площади
		int square = x * y;
		return square; 				//возвращаем int переменную и принимаем ее в методе main 
	}

	static int calcSquare(int x) { 			//метод нахождения площади квадрата
		return x * x; 				//не обязательно создавать переменную  методе, для сохранения выполнения операции,
							//можно просто вернуть результат выполнения и записать его в месте вызова
	}
}

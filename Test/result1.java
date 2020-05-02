class result1 {
	public static void main(String[] args) {
		int a = 1; //создали переменную a и записали в нее значение
		int b = 3; //создали переменную b и записали в нее значение
		
		sum d = new sum();
		int e = d.getResult(a, b);
		System.out.println(e);
	}
}


class sum {
		
	public int getResult(int a, int b) { //публичная статичная с возвращаемым параметром int с именем getResult (принимает два параметра int a, int b);
		int c;	//переменная с в котороу будет записываться результат сложения
		c = a + b; //выполнение сложения двух переменных
		return c; //возвращение результата с
	}

}


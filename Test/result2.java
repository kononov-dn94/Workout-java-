class result2 {
	public static void main(String[] args) {
		int x = 1; //создали переменную a и записали в нее значение
		int y = 3; //создали переменную b и записали в нее значение

		sum d = new sum();
		d.a = x; //ссылочная переменная d.ссылается на переменную а объекта d класса sum = в которую записывается значение переменной x класса result2
		d.b = y;
		int e = d.getResult();
		System.out.println(e);
	}
}


class sum {
	
	int a;
	int b;
		
	public int getResult() { //публичная статичная с возвращаемым параметром int с именем getResult (принимает два параметра int a, int b);
		int c;	//переменная с в котороу будет записываться результат сложения
		c = a + b; //выполнение сложения двух переменных
		return c; //возвращение результата с
	}

}


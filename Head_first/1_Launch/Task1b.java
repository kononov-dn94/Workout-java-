class Task1b {							//cсоздан класс с именем Task1b (который отсутствовал)
	public static void main (String [] args) {		//публичная функция возвращающая нечего main (передающая строчный массив под названием args)
		int x = 5;					//создаем переменную x и приравниваем ее к значению 5

		while (x > 1) {					//пока x > 1 меньшаем значение x на единицу (x = x -1)
			x = x - 1;

			if (x < 3) {				//если x < 3, то заходим в тело цикла и выводим сообщение (при заданных параметрах данное условие произойдет два раза, т.е. выведет два сообщения
				System.out.println("большой икс");
			}
		}
	}
}

public class GuessGame { //Класс GuessGame содержит три переменных экземпляра для трех объктов Player
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() { //Cоздаем три объекта Player и присваиваем их трем переменным экземпляра
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0; //Объявляем три переменные для хранения вариантов от каждого игрока
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false; //Объявляем три переменные для хранения 
		boolean p2isRight = false; //правильности и неправильности (true/false) для ответов игроков
		boolean p3isRight = false; //Изначально их значение равно false

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Я загадываю число от 0 до 9");
		
		while(true) {
			System.out.println("Число, которое нужно угадать, -" + targetNumber);

			p1.guess(); //Вызываем метод guess() из каждого объкта Player
			p2.guess();
			p3.guess();
						
			guessp1 = p1.number; //извлекаем варианты каждого игрока (результаты работы их методов guess()), получая доступ к их переменным number
			System.out.println("Первый игрок думает, что это " + guessp1);

			guessp2 = p2.number;
			System.out.println("Второй игрок думает, что это " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Третий игрок думает, что это " + guessp3);

			if (guessp1 == targetNumber) { //Проверяем варианты каждого из игроков на соответствие заданному числу.
				p1isRight = true;      //Если игрок угадал, то присваиваем соответствующей переменной значение
			}			       //true (помним, что по умолчанию она false)
			if (guessp2 == targetNumber) { 
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight) { //ЕСЛИ первый игрок ИЛИ второй игрок ИЛИ третий игрок угадал, то..

				System.out.println("У нас есть победитель!");
				System.out.println("Первый игрок угадал!?" + p1isRight);
				System.out.println("Второй игрок угадал!?" + p2isRight);
				System.out.println("Третий игрок угадал!?" + p3isRight);
				System.out.println("Конец игры.");
				break; //прерываем цикл (игра закончена)
			}else{ //ИНАЧЕ остаемся в цикле и просим сделать еще одну попытку
				System.out.println("Игроки должны попробовать еще раз!");
			} //конец if/else
		} //конец цикла
	} //конец метода
} //конец класса


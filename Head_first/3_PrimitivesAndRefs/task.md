1. Dog.java        Применял изученный материал (смотрел на работу ссылок/прикаких условиях происходит обращение к ссылкам/переменным)

2. TestArrays.java        (Собрать части работающего Java-приложения расбросанных в хаотичном порядке)

3. Books.java          Скомпилировать исходник и в случае ошибки - понять, где ошибка


class Books {
	String title;
	String author;
}

class BooksTestDrive {
	public static void main(String[] args) {
		Books[] myBooks = new Books [3];
		int x = 0;

		myBooks[0].author = "Боб. ";
		myBooks[1].author = "Сью. ";
		myBooks[2].author = "Ян. ";
	
		while (x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(", автор ");
			System.out.print(myBooks[x].author);
			x = x + 1;
		}
	}
}


4. Hobbits.java    (Скомпилировать исходник и в случае ошибки - понять, где ошибка)

class Hobbits {
	String name;
	public static void main(String[] args) {
		Hobbits[] h = new Hobbits[3];

		while (z < 4) {
			z = z + 1;
			h[z] = new Hobbits();
			h[z].name = "Бильбо";

			if (z == 1) {
				h[z].name = "Фродо";
			}

			if (z == 2) {
				h[z].name = "Сэм";
			}

			System.out.print(h[z].name + " - ");
			System.out.print("имя хорошего хоббита. ");
		}
	}
}

5. Triangle.java   (Дописать недостающие куски кода. Создать класс)

class Triangle {
	double area;
	int height;
	int length;
	public static void main (String[] args) {
		____________________________
		____________________________
		
		while (_____________) {
			_____________________________
			_____.height = (x + 1) * 2;
			_____.height = x + 4;
			_____________________________
			
			System.out.print("треугольник "+x+", зона");
			System.out.println(" = " + _____.area);
			________
		}

		__________
		x = 27;
		Triangle t5 = ta[2];
		ta[2].area = 343;
		
		System.out.print(" y = " + y);
		System.out.println(", зона t5 = " + t5.area);
	}
	void setArea() {
		______ = (height * length) / 2;
	}
}

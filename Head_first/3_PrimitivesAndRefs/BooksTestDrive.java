class Books {
	String title;
	String author;
}

class BooksTestDrive {
	public static void main(String[] args) {
		Books[] myBooks = new Books [3];
		int x = 0;

		myBooks[0] = new Books(); //создали три объекта Book, 
		myBooks[1] = new Books(); //в самом задании они отсутствовали и
		myBooks[2] = new Books(); //нужно было понять, в чем ошибка.

		myBooks[0].title = "Плоды Java";
		myBooks[1].title = "Java Гетсби";
		myBooks[2].title = "Сборник репептов по Java";

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

/*создать класс Song
в нем два поля: Artist/Title
Создать две функции, одна меняет значение переменной, другая возвращает значение (для переменных Artist, Title)
Также создать функции, которые будут менять и возвращать Artist, Title.
функция с именем Play() в классе Song, должна возвращать строку: Artist '-' Title
создать два разных объекта класса Song с разными Artist и Title и для них выполнить функцию Play и вывести результат
(Play функция класса Song)*/

class Song {

	String Artist;
	String Title;
	

	void checkTHIS(String Artist) {
		System.out.println(this.Artist);
		System.out.println(Artist);
	}
	void setArtist(String a) {
		this.Artist = a;
	}

	String getArtist() {
		return Artist;
	}

	void setTitle(String t) {
		Title = t;
	}

	String getTitle() {
		return Title;
	}
		
	public String Play() {
		String a = Artist + "-" + Title;
		return a;
	}
	
	void setArtistTitle(String a, String t) {
/*		this.Artist = a;
		this.Title = t; */
		setArtist(a);
		this.setTitle(t);
		System.out.println(this.Artist);
		System.out.println(this.Title);
	}
/*
	String[] getArtistTitle() {
		num[1] = a;
		num[2] = t;
	}
*/	
}

class SongTestDrive {
	int x;

	public static void main(String[] args) {
		Song x = new Song();
		this.x 
		/*Song y = new Song();
		String Result;
		x.setArtist("qwerty");
		x.checkTHIS("check");*/
		
		x.setArtistTitle("abc", "cde");
		System.out.println(x.Artist + " " + x.Title);

		/*System.out.println(x.getArtist());
		x.setTitle("ytrewq");
		String temp = x.getTitle();
		System.out.println(x.getTitle());
		System.out.println(x.Play());
		Result = x.Play(); 
		System.out.println(Result);*/
		

	}

	void func() {
		x
	}
}

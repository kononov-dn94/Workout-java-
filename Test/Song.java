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
	
	void setArtist(String a) {
		Artist = a;
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
		
	}

	String[] getArtistTitle() {
		num[1] = a;
		num[2] = t;
	}

}

class SongTestDrive {

	public static void main(String[] args) {
		Song x = new Song();
		String Result;
		x.setArtist("qwerty");
		System.out.println(x.getArtist());
		x.setTitle("ytrewq");
		System.out.println(x.getTitle());
		System.out.println(x.Play());
		Result = x.Play(); 
		System.out.println(Result);
		

	}
}

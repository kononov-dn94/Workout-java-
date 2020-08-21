public class metodString {
	public static void main(String[] args) {
		String str1 = "I like coffee";
		System.out.println(str1.toUpperCase()); //метод toUpperCase() позволяет выводить строку в верхнем регистре
		System.out.println(str1.toLowerCase()); //метод toLowerCase() позволяет выводить строку в нижнем регистре

		String str2 = "I like coffee";
		boolean b = str2 == str1; //оператор == проверяет является ли ссылка, хранящаяся в переменной str1 такой же как и в переменной str2 
		System.out.println(b);

		String str3 = "I like coffee!!!";
		System.out.println("Substring = " +str3.substring(0, 13)); //метод substring принимает или один параметр или два типа int
									   //substring(int beginIndex) - начальный индекс, 
									   	   //с которого нужно отрезать конец строки, или
									   //substring(int beginIndex, int endIndex) - начальный и конечный индекс
										   //причем, конечный индекс не включается 
		String str4 = new String("I like coffee");
		boolean d = str2.equals(str4); //метод equals сравнивает две строки если они являются двумя разными обьектами
		System.out.println(d);

		boolean p = str1.startsWith(" like", 1); //метод 
		System.out.println(p);
		System.out.println(str1.endsWith("fee!")); //
		System.out.println(str3.indexOf("!!!")); //метод возвращает индекс того элемента, которое мы ищем
	}
}

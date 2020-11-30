public class Dog {
	private static int dogsCount;

	public int paws;
	public int tail;
	public String name;
	public String breed;

	public Dog() { //конструктор
		dogsCount++;
		System.out.println("Dog's count is "+dogsCount);
	}

	public static int getDogsCount() {
		return dogsCount;
	}

	private String size; //размер собаки
	public void setSize(String size) {
		if(size.equalsIgnoreCase("Big") || size.equalsIgnoreCase("Average") || size.equalsIgnoreCase("Small")) {
			this.size = size;
		} else {
			System.out.println("Size should be one of these: Big, Average of Small");
		}
	}
	public String getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name; //полю текущего обьекта присваиваем передаваемое имя 
	/*или 
	public void setName(String dogsName) {
		name = dogsName;
	}*/

	}

	public String getName() {
		return name;
	}

	public void setPaws(int paws) {
		if(paws == 4) {
			this.paws = paws;
		} else {
			System.out.println("User tried to assing " +paws+ "paws for a dog");
			System.out.println("Correct number is 4");
		}
	}

	public int getPaws() {
		return paws;
	}
	
	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		if(tail == 1) {
			this.tail = tail;
		} else {
			System.out.println("User tried to assing " +tail+ "paws for a dog");
			System.out.println("Correct number is 1");
		}
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void bark() { //лай (псины сутулой)
		if(size.equalsIgnoreCase("Big")) {
			System.out.println("Wof-Wof");
		} else if(size.equalsIgnoreCase("Average")) {
			System.out.println("Raf-Raf");
		} else {
			System.out.println("Tiaf-Tiaf");
		}
	}

	public void bite() { //размер собаки
		if(dogsCount > 2) {
			System.out.println("Dog's are biting you");
		} else {
			bark();
		}
	}

	
}


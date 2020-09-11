public class Dog {
	public int paws;
	public int tail;
	public String name;
	public String breed;

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
			this.paws = 4;
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
			this.tail = 1;
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
	
}


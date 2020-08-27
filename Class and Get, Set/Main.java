public class Main {
	public static void main(String[] args) {
		Dog lab = new Dog();
		lab.setPaws(4);
		lab.setTail(1);
		lab.setName("Charley");
		lab.setBreed("Lab");
		lab.setSize("Average");
		lab.bark();

		Dog sheppard = new Dog();
		sheppard.setPaws(4);
		sheppard.setTail(1);
		sheppard.setName("Mike");
		sheppard.setBreed("Sheppard");
		sheppard.setSize("Big");
		sheppard.bark();

		System.out.println("Lab's name is "+ lab.getName());
		System.out.println("Sheppard's name is "+ sheppard.getName());
		System.out.println("Lab has " +lab.getPaws()+"paws");
		
	}
}

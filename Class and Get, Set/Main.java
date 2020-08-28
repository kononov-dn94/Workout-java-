public class Main {
	public static void main(String[] args) {
		System.out.println("Dog's count "+Dog.getDogsCount());	

		Dog lab = new Dog();
		lab.setPaws(4);
		lab.setTail(1);
		lab.setName("Charley");
		lab.setBreed("Lab");
		lab.setSize("Average");
		lab.bite();

		Dog sheppard = new Dog();
		sheppard.setPaws(4);
		sheppard.setTail(1);
		sheppard.setName("Mike");
		sheppard.setBreed("Sheppard");
		sheppard.setSize("Big");
		sheppard.bite();

		Dog doberman = new Dog();
		doberman.setPaws(4);
		doberman.setTail(1);
		doberman.setName("Jack");
		doberman.setBreed("Doberman");
		doberman.bite();

		System.out.println("Lab's name is "+ lab.getName());
		System.out.println("Sheppard's name is "+ sheppard.getName());
		System.out.println("Lab has " +lab.getPaws()+"paws");
		
	}
}

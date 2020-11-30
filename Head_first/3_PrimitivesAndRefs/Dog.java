class Dog{

	int val = 0;

	public static void main (String[] args){
		Dog[] pets;
		pets = new Dog[7];
		pets[0] = new Dog();
		pets[1] = new Dog();
		pets[2] = new Dog();
		
		pets[0].val = 1;
		pets[2].val = 5;

		pets[3] = pets[2];
		System.out.println(pets[3].val);
		
		pets[2].val = 7;
		System.out.println(pets[3].val);
		
		pets[2] = pets[0];
		System.out.println(pets[3].val);
		
		pets[2] = pets[3];		
		System.out.println(pets[2]);
		
		Dog refDog = pets[3];
		System.out.println(refDog.val);


	}
}

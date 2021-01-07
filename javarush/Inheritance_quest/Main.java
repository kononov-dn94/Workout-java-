public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Джек");
        Dog dog2 = new Dog("Рекс");

        Cat cat1 = new Cat("Pussy");

 /*       Animal[] animals = {dog1, dog2, cat1};
        for (Animal animal : animals)
        {
            animal.printName();
            System.out.println(animal.getHungryState());
            System.out.println(animal.getClass().getSimpleName());
        }*/

        dog1.printName();
        dog2.printName();
        System.out.println(dog1.getHungryState());
        System.out.println(dog2.getHungryState());

        cat1.printName();
        System.out.println(cat1.getHungryState());



    }
}

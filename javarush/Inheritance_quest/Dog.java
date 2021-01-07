public class Dog extends Animal {
    Dog(String name) {
        super(name);
        type = "Dog";
    }

    @Override
    public void printName() {
        System.out.println(type + " " + name);
    }
}

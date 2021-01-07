public class Cat extends Animal {
    Cat(String name) {
        super(name);
        type = "Cat";
    }

    @Override
    public void printName() {
        System.out.println(type + " " + name);
    }
}

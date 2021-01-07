import java.util.Random;


public class Animal {
    //
    public static enum State {
        HUNGRY,
        SATIETY
    }

    protected String name; //имя
    protected String sex; //пол
    protected State hungryState; //состояние сытости
    protected String type; //вид животного

    public String getName() {
        return name;
    }

    public void setName(String a) {
        name = a;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String b) {
        sex = b;
    }

    public void printName() {
        System.out.println(name);
    }

    public State getHungryState() {
        int randIndex = new Random().nextInt(State.values().length);
        hungryState = State.values()[randIndex];
        return hungryState;
    }

    Animal(String name) {
        this.name = name;
    }

}

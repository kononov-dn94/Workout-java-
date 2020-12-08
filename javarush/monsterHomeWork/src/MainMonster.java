//package monsterHomeWork;

public class MainMonster {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Monster monster1 = new Monster(1);
        Monster monster2 = new Monster(3, 3);
        Monster monster3 = new Monster(4, 4, 4);

        monster.monsterInfo();
        monster1.monsterInfo();
        monster2.monsterInfo();
        monster3.monsterInfo();

        String monster5 = Monster.monsterInfo(5, 5, 5);
        System.out.println(monster5);

        monster.voice();
        monster1.voice(5);
        monster2.voice(7, "lol");
        monster.voice = "New text";
        monster.voice();
        monster3.voice();
        monster2.voice();

    }
}
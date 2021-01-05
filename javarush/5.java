/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg name1 = new Zerg();
        Zerg name2 = new Zerg();
        Zerg name3 = new Zerg();
        Zerg name4 = new Zerg();
        Zerg name5 = new Zerg();
        name1.name = "Зерглинг";
        name2.name = "Гиблинг";
        name3.name = "Гидралиск";
        name4.name = "Люркер";
        name5.name = "Бруталиск";
        
        Protoss name6 = new Protoss();
        Protoss name7 = new Protoss();
        Protoss name8 = new Protoss();
        name6.name = "Зератул";
        name7.name = "Артанис";
        name8.name = "Тассадар";
        
        Terran name9 = new Terran();
        Terran name10 = new Terran();
        Terran name11 = new Terran();
        Terran name12 = new Terran();
        name9.name = "Джим Рейнор";
        name10.name = "Ариэль Хэнсон";
        name11.name = "Сарра Керриган";
        name12.name = "Мэтт Хорнер";
        
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}


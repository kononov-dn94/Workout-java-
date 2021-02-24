public class Main {

   public static void main(String[] args) {
       HashMap<Integer, String> passportsAndNames = new HashMap<>();


       passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
       passportsAndNames.put(162348, "Иван Михайлович Серебряков");
       passportsAndNames.put(8082771, "Дональд Джон Трамп");
       System.out.println(passportsAndNames);

   }

// Нарушение симметричности
public class SomeStringify {
    private String s;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof SomeStringify) {
            return s.equals(((SomeStringify) o).s);
        }
        // нарушение симметричности, классы разного происхождения
        if (o instanceof String) {
            return s.equals(o);
        }
        return false;
    }
}
}

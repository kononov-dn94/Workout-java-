public class Solution {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Man man = new Man();
        woman.husband = man;
        man.wife = woman;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}

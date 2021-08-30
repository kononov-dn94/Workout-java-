public class MainClass
{
   public static void main (String[] args)
   {
    ┏ Tommy
    ┃ Cat cat = new Cat("Tommy");
    ┃ cat = null;
    ┗
    ┏ Sammy
    ┃ Cat cat1 = new Cat("Sammy");
    ┃┏ Maisy
    ┃┃Cat cat2 = new Cat("Maisy");
    ┃┃cat2 = cat1;
    ┃┗
    ┃┏ Ginger
    ┃┃cat1 = new Cat("Ginger");
    ┃┃ cat2 = null;
    ┃┗
    ┗
   }
}

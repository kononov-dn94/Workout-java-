public class Main{
  public static void main(String[] args){
    new Cats("Васька").info();
    Cats cat2 = new Cats();
    cat2.info();
    Cats cat3 = new Cats("Персик");
    cat3.info();

    try{
      cat2 = null;
      cat2.info();
}
    catch(NullPointerException e){
      System.out.println(e.getMessage());
  }
 }
}
public class Cats{
  String name;
  public Cats(){
}
  public Cats(String name){
    this.name = name;
}
  public void info(){
    System.out.println("Тест");
 }
}

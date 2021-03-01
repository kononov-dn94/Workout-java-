//считаем колличество раз того или иное слово встречается в тексте введенные с консоли/отсортировать слова по убыванию


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class MapLauncher {

    private static void printMap(Map<String, Integer> wordMap) {
        //обрабатываем все ключи и значения в Map
        Set<String> keys = wordMap.keySet();

        //иттерируемся по Map
        for(String key: keys) {
            System.out.printf("%-10s%-10s \n", key, wordMap.get(key));
        }
    }
    
   
    public static void main(String[] args) {
        Map<String, Integer> wordMap = new HashMap<>(); //Карта, в качестве ключа содержит String, в качестве значения Integer
        System.out.println("Please enter some text");
        Scanner scanner = new Scanner(System.in); //метод ввода с консоли
        String string = scanner.nextLine(); //результат ввода с консоли сохраняем в переменную
        String[] tokens = string.split(" "); //делим наше строку на отдельные слова по пробелу

        //преобразуем все слова в нижний регистр
        for(String token: tokens) {
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);

            //Если wordMap содержит уже какое-то слово - то он вернет колличество обработанных итераций данного слова, если такое слово еще не встречалось - то вернет null
            if(count == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, count+1);
            }
        }

        printMap(wordMap);
    }
}


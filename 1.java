import java.sql.SQLOutput;
import java.util.Scanner;

public class Battleship {
    static String playerName1; //объявили статичную строковую переменную(инициализация игрока №1)
    static String playerName2; //объявили статичную строковую переменную(инициализация игрока №2)
    static Scanner scanner = new Scanner(System.in); //статичный объект scanner типа Scanner, спомощью которого будет осуществляться ввод с клавиатуры
    static int[][] battlefield1 = new int[10][10]; //массив для размещение кораблей для 1-го игрока
    static int[][] battlefield2 = new int[10][10]; //массив для размещение кораблей для 2-го игрока

    public static void main(String[] args) {
        System.out.println("Player#1, please enter your name:");
        playerName1 = scanner.nextLine(); //объект scanner вызывает метод nextLine() который вернет строку введенную с клавы переменной playerName1
        System.out.println("Player#2, please enter your name:");
        playerName2 = scanner.nextLine(); //объект scanner вызывает метод nextLine() который вернет строку введенную с клавы переменной playerName2
 
        System.out.println("Player#1 name: ");
        System.out.println(playerName1);
        System.out.println("Player#2 name: ");
        System.out.println(playerName2);
        placeShips();


    }

    public static void placeShips() { //метод расстановки кораблей
        int deck = 4; //счетчик, инициализация для 4-х палубного корабля
        while(deck >= 1) {
            System.out.println();
            System.out.println(playerName1 + ", please place your " + deck +"-deck ship on the battlefield:");
            System.out.println();

            drawField(battlefield1); //че за хуйня, почему я не могу вызвать метот

            System.out.println("please enter nX coordinate:");
            int x = scanner.nextInt(); //объект scanner вызывает метод nextInt который вернет целое число в переменную x и запишет его значение
            System.out.println("please enter nY coordinate:");
            int y = scanner.nextInt(); //объект scanner вызывает метод nextInt который вернет целое число в переменную y и запишет его значение
            System.out.println("Choose direction:");
            System.out.println("1. Vertical.");
            System.out.println("2. Horizontal.");
            int direction = scanner.nextInt(); //храним в переменной rotation выбранное значение направления корабля

            for (int i = 0; i < deck; i++) {
                if(direction == 1){
                    battlefield1[x][y+1] = 1;
                } else {
                    battlefield1[x + i][y] = 1;
                }
            }

        }
        deck--;
    }

    public static void drawField(int[][] battlefield) { //метот отображение игровых полей для обоих игроков
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for(int i = 0; i < battlefield.length; i++) { //цикл вывода(отображения игрового поля)
            System.out.print(i + " ");
            for (int j = 0; j < battlefield[1].length; j++) { //цикл вывода элементов для каждой строки
                if(battlefield[i][j] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

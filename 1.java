import java.sql.SQLOutput;
import java.util.Scanner;

public class Battleship {
    static String playerName1; //объявили статичную строковую переменную(инициализация игрока №1)
    static String playerName2; //объявили статичную строковую переменную(инициализация игрока №2)
    static Scanner scanner = new Scanner(System.in); //статичный объект scanner типа Scanner, спомощью которого будет осуществляться ввод с клавиатуры
    static int[][] battlefield1 = new int[10][10]; //массив для размещение кораблей для 1-го игрока
    static int[][] battlefield2 = new int[10][10]; //массив для размещение кораблей для 2-го игрока
    static int[][] monitor1 = new int[10][10]; //массив для размещения попаданий 1-го игрока
    static int[][] monitor2 = new int[10][10]; //массив для размещения попаданий 2-го игрока

    public static void main(String[] args) {
        System.out.println("Player#1, please enter your name:");
        playerName1 = scanner.nextLine(); //объект scanner вызывает метод nextLine() который вернет строку введенную с клавы переменной playerName1
        System.out.println("Player#2, please enter your name:");
        playerName2 = scanner.nextLine(); //объект scanner вызывает метод nextLine() который вернет строку введенную с клавы переменной playerName2

//        System.out.println("Player#1 name: ");
//        System.out.println(playerName1);
//        System.out.println("Player#2 name: ");
//        System.out.println(playerName2);
        placeShips(playerName1, battlefield1);
        placeShips(playerName2, battlefield2);

        boolean endGame = false;
        do {
            makeTurn(playerName1, monitor1, battlefield2); //вызов метода если ход 1-го игрока
            makeTurn(playerName2, monitor2, battlefield1); //вызов метода если ход 2-го игрока
        } while(!endGame); //пока endGame не true - выполняем do


    }

    public static void placeShips(String playerName, int[][] battlefield) { //метод расстановки кораблей
        int deck = 4; //счетчик, инициализация для 4-х палубного корабля
        while(deck >= 1) {
            System.out.println();
            System.out.println(playerName + ", please place your " + deck +"-deck ship on the battlefield:");
            System.out.println();

            drawField(battlefield);

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
                    battlefield[x][y + i] = 1;
                } else {
                    battlefield[x + i][y] = 1;
                }
            }
            deck--;
        }
    }

    public static void drawField(int[][] battlefield) { //метот отображение игровых полей для обоих игроков
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for(int i = 0; i < battlefield.length; i++) { //цикл вывода(отображения игрового поля)
            System.out.print(i + " ");
            for (int j = 0; j < battlefield[1].length; j++) { //цикл вывода элементов для каждой строки
                if(battlefield[j][i] == 0) { //при [i][j] матрица будет перевернута
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void makeTurn(String playerName, int[][] monitor, int[][] battlefield) { //метод для поля ходов оппоненита
        while(true) { //цикл попаданий, прервется только в случае промоха игрока
            System.out.println(playerName + "please, make your turn.");
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) { //цикл вывода(отображения игрового поля)
                System.out.print(i + " ");
                for (int j = 0; j < monitor[1].length; j++) {
                    if (monitor[j][i] == 0) { //если 0 - не стреляли
                        System.out.print("- ");
                    } else if (monitor[j][i] == 1) { //если 1 - стреляли, не попали
                        System.out.print(". ");
                    } else { //все остальное - есть пробитие!
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
            System.out.println("please enter nX coordinate:");
            int x = scanner.nextInt();
            System.out.println("please enter nY coordinate:");
            int y = scanner.nextInt();
            if (battlefield[y][x] == 1) { //сверяемся, попал ли игрок
                System.out.println("Hit! Make your turn again!");
                monitor[y][x] = 2;
            } else {
                System.out.println("Miss! Your opponents turn!");
                monitor[y][x] = 1;
                break; //прервет внешний цикл
            }
        }
    }

    public static void isWinCondition() { //метод распознавания победы одного из игроков
        int counter1 = 0; //переменная, хранящая кол-во попаданий
        for (int i = 0; i < monitor1.length; i++) { //счетчик для 1-го игрока
            for (int j = 0; j < monitor1.length; j++) {
                if(monitor1[i][j] == 2) {
                    counter1++; //как только кол-во попаданий = 10 - завершаем игру
                }
            }
        }

        int counter2 = 0; //переменная, хранящая кол-во попаданий
        for (int i = 0; i < monitor2.length; i++) { //счетчик для 2-го игрока
            for (int j = 0; j < monitor2.length; j++) {
                if(monitor1[i][j] == 2) {
                    counter2++; //как только кол-во попаданий = 10 - завершаем игру
                }
            }
        }

        if (counter1 >= 10) {
            System.out.println(playerName1 + " WIN!!!");
            return true;
        }

        if (counter2 >= 10) {
            System.out.println(playerName2 + " WIN!!!");
            return true;
        }
        return false;
    }
}

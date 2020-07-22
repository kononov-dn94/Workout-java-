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
        System.out.println("Игрок №1, пожалуйста, введите ваше имя:");
        playerName1 = scanner.nextLine(); //объект scanner вызывает метод nextLine() который вернет строку введенную с клавы переменной playerName1
        System.out.println("Игрок №2, пожалуйста, введите ваше имя:");
        playerName2 = scanner.nextLine(); //объект scanner вызывает метод nextLine() который вернет строку введенную с клавы переменной playerName2

        placeShips(playerName1, battlefield1);
        placeShips(playerName2, battlefield2);

        while(true) {
            makeTurn(playerName1, monitor1, battlefield2); //вызов метода если ход 1-го игрока
            if(isWinCondition()) { //после каждого хода проверяем, не наступила ли победа
                break; //...и если условие "победы" совпало - прерываем цикл
            }

            makeTurn(playerName2, monitor2, battlefield1); //вызов метода если ход 2-го игрока
            if(isWinCondition()) { //после каждого хода проверяем, не наступила ли победа
                break; //...и если условие "победы" совпало - прерываем цикл
            }
        }
    }

    public static void placeShips(String playerName, int[][] battlefield) { //метод расстановки кораблей
        int deck = 4; //счетчик, инициализация для 4-х палубного корабля
        while(deck >= 1) {
            System.out.println();
            System.out.println(playerName + ", пожалуйста, разместите " + deck +"-палубный корабль на поле:");
            System.out.println();

            drawField(battlefield);

            System.out.println("пожалуйста, введите nX координату:");
            int x = scanner.nextInt(); //объект scanner вызывает метод nextInt который вернет целое число в переменную x и запишет его значение
            System.out.println("пожалуйста, введите nY координату:");
            int y = scanner.nextInt(); //объект scanner вызывает метод nextInt который вернет целое число в переменную y и запишет его значение
            System.out.println("Выберите направление:");
            System.out.println("1. Вертикально.");
            System.out.println("2. Горизонтально.");
            int direction = scanner.nextInt(); //храним в переменной rotation выбранное значение направления корабля

            if(!isAvailable(x, y, deck, direction, battlefield)) { //
                System.out.println("Неправильные координаты!");
                continue;
            }

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
            System.out.println(playerName + "пожалуйста, сделайте ваш ход");
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
            System.out.println("пожалуйста, введите nX координату:");
            int x = scanner.nextInt();
            System.out.println("пожалуйста, введите nY координату:");
            int y = scanner.nextInt();
            if (battlefield[x][y] == 1) { //сверяемся, попал ли игрок
                System.out.println("Попадание! Стрелай еще!");
                monitor[x][y] = 2;
            } else {
                System.out.println("Промах! Теперь очередь Вашего аппонента!");
                monitor[x][y] = 1;
                break; //прервет внешний цикл
            }
        }
    }

    public static boolean isWinCondition() { //метод распознавания победы одного из игроков
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
            System.out.println(playerName1 + " Победа!!!");
            return true;
        }

        if (counter2 >= 10) {
            System.out.println(playerName2 + " Победа!!!");
            return true;
        }
        return false;
    }

    public static boolean isAvailable(int x, int y, int deck, int rotation, int[][] battlefield) { //метод проверки выхода за границу поля
        if(rotation == 1) { //если корабль размещен вертикально...
            if(y + deck > battlefield.length + 1) { //проверяем y
                return false;
            }
        }
        if(rotation == 2) { //если корабль размещен горизонтально...
            if(x + deck > battlefield.length + 1) { //проверяем x
                return  false;
            }
        }

        //проверка на невозможность размещения корабля на рядомстоящие клетки
        while(deck !=0) {
            for (int i = 0; i < deck; i++) {
                int xi = 0;
                int yi = 0;
                if(rotation == 1){
                    yi = i;
                } else {
                    xi = 1;
                }
                if(x + 1 + xi < battlefield.length && x + 1 + xi >= 0) {
                    if(battlefield[x + 1 + xi][y + yi] != 0) {
                        return false;
                    }
                }
                if(x - 1 + xi < battlefield.length && x - 1 + xi >= 0) {
                    if(battlefield[x - 1 + xi][y + yi] != 0) {
                        return false;
                    }
                }
                if(y + 1 + yi < battlefield.length && y + 1 + yi >= 0) {
                    if(battlefield[x + xi][y + 1 + yi] != 0) {
                        return false;
                    }
                }
                if(y - 1 + yi < battlefield.length && y - 1 + yi >= 0) { 
                    if(battlefield[x + xi][y - 1 + yi] != 0) {
                        return false;
                    }
                }
            }
            deck--;
        }
        return true;
    }
}

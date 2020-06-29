import java.io.IOException;
import java.util.Scanner;

public class BattleShip {
	public static String playerName1 = "Player#1";
	public static String playerName2 = "Player#2";
	public static int[][] battleField1 = new int[10][10];
	public static int[][] battleField2 = new int[10][10];
	public static int[][] battleMonitor1 = new int[10][10];
	public static int[][] battleMonitor2 = new int[10][10];
	public static Scanner scanner = new Scanner(System.in);
	public static boolean firstPlayerTurn = true;

	public static void main(String[] args) throws IOException, InterruptedException {
		generateBattleField(battleField1, playerName1);
		generateBattleField(battleField1, playerName2);
		System.out.println("Наконец-то достойный противник! НАША БИТВА БУДЕТ ЛЕГЕНДАРНОЙ!11");

		for(int i = 0; i < 15; i++) {
			System.out.println();
		}

		while(!checkWinCondition()) {
			if(firstPlayerTurn) {
				makeTurn(playerName1, battleMonitor1, battleField2);
				firstPlayerTurn = false;
			} else {
				makeTurn(playerName2, battleMonitor2, battleField1);
				firstPlayerTurn = true;
			}
		}
	}

	public static void printField(int[][] battleField) {
		System.out.println(" 0 1 2 3 4 5 6 7 8 9");
		
		for(int i = 0; i < battleField.length; i++) {
			System.out.print(i);
			System.out.print(" ");

			for(int j = 0; j < battleField[1].length; j++) {
				if(battleField[j][i] == 1) {
					System.out.print("X");
				} else {
					System.out.print("_");
				}
				
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

	public static void printMonitor(int[][] monitor) {
		System.out.println(" 0 1 2 3 4 5 6 7 8 9");

		for(int i = 0; i < monitor.length; i++) {
			System.out.print(i);
			System.out.print(" ");

			for(int j = 0; j < monitor[1].length; j++) {
				if(battleField[j][i] == 1) {
					System.out.print("_");
				
				} else if (monitor[j][i] == 1) {
					System.out.print(".");
				
				} else {
					System.out.print("X");
				}
				
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	
	public static void generateBattleField(int[][] battleField, String playerName) throws IOException {
		int deck = 4;
		while(deck != 0) {
			/* System.out.println(playerName + " размести свою пасудину " + deck + " колличеством клеток, боец!");
			printField(battleField);
			System.out.println();

			int x = -1;
			while (x < 0 )*/
		}
	}
}

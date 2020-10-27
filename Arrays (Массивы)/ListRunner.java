package com.java.collections.list;

import java.util.Arrays;

public class ListRunner {
	public static void main(String[] args) {
		ToDoList List = new ToDoList();
		printOut();
		int param = scanner.nextInt();
		while(param!=0)	{
			switch(param) {
				case 1:
					System.out.println("please enter a task to add");
					scanner.nextLine();
					String task1 = scanner.nextLine();
					list.addToList(task1);
					System.out.println("Please choose an action by typing [0-6]");
					break;
				case 2:
					System.out.println("Printing out TO DO LIST");
					list.printToDoList();
					System.out.println("Please choose an action by typing[0-6]");
					break;
				case 3:
					System.out.println("please enter a task remove");
					scanner.nextLine();
					String task3 = scanner.nextLine();
					list.addToList(task3);
					System.out.println("Please choose an action by typing [0-6]");
					param = scanner.nextInt();
					break;
					break;
				case 4:
					System.out.println("please enter a task remove");
					scanner.nextLine();
					String task4 = scanner.nextLine();
					list.addToList(task4);
					System.out.println("Please choose an action by typing [0-6]");
					param = scanner.nextInt();
					break;
				case 5:
					break;
				case 6:
					break;
					default:
						param = 0;

			}
		}
	}
}

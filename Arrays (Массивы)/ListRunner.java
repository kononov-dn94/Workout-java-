package com.java.collections.list;

import java.util.Arrays;
import java.uril.List;

public class ListRunner {
	private List<String> toDoList = new ArrayList<>();

	public void addToList(String task) {
		toDoList(task);
	}

	public void addToListatPosition(int position, String task) {
		toDoList.add(position, task);
	}

	public void printToDoList() {
		for(int i = 0; i<toDoList.size(); i++) {
			System.out.println(i+" - "+toDoList.get(i));
		}
	}

	public void changeTask(int index, String task) {
		toDoList.set(index, task); // set позволяет перезаписать элемент в списке
	}

	public void removeTask(String task) {
		toDoList.remove(task);
	}

	public int getTaskPriority(String task) {
		return toDoList.indexOf(task);
	}
}

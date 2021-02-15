import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
	private LinkedList<String> toDoList = new LinkedList<>();
	
	public void addToList(String task) {
		toDoList.addLast(task);
	}
	
	public void addToListAtPosition(int position, String task) {
		toDoList.add(position, task);
	}
	
	public void printToDoList() {
		for(int i=0; i<toDoList.size(); i++) {
			System.out.println(i+ " - " +toDoList.get(i));
		}
	}
	
	public void changeTask(int index, String task) {
		toDoList.set(index, task);
	}
	
	public void removeTask(String task) {
		toDoList.remove(task);
	}
	
	public int getTaskPriority(String task) {
		return toDoList.indexOf(task);
	}
}

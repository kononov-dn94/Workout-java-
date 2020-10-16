public class ToDoList {

	private List<String> toDoList = new ArrayList<>();

	public void addToList(String task) {
		toDoList(task);
	}

	public void addToListatPosition(int position, String task) {
		toDoList.add(position, task);
	}

	public void printToDoList() {
//		for(int i = 0; i<toDoList.size(); i++) {
//			System.out.println(i+" - "+toDoList.get(i));
//		}
		iterator<String> iterator = toDoList.iterator();
		while (iterator.hasNext()) {
			System.out.println("Element " +iterator.next());
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

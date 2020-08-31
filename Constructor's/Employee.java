public class Employee {
	private static int id;
	private int employeeId;
	private String name;
	private String position;
	private int salary;

	private String department;

	public Employee(String name, String position, int salary) { //конструктор
		this(name, position, salary, "IT");
		toString(); //можно, но не рекомендуется вызывать метод из конструктора
		this. name = name;
		this.position = position;
		this.salary = salary;
	}

	private Employee(String name, String position, int salary, String department) { //конструктор
		employeeId = id++;		
		this. name = name;
		this.position = position;
		this.salary = salary;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public static int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}
		
	public int getSalary() {
		return salary;
	}

	public String toString() {//метод toString() спользуется тогда, когда необходимо вывести содержание объекта преобразовав его в строку
		return "Employee(" + "employeeId=" + employeeId + ", name='" + name + '\'' + ", position='" + position + '\'' + ", salary=" + salary + ')'; 
	}
}

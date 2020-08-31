/*import com.javalesson.domainmodel.Employee;
import java.util.*;
import java.util.Date;
import static java.lang.Math.**/

public class ConstructorsMain {
	public static void main(String[] args) {

	/*	double sqrt = Math.sqrt(4);
		double sqrt1 = Math.sqrt(9);
		
		double sin = Math.sin(0.235);*/
	
		Employee employee = new Employee("Dmitriy", "developer", 100); //вызывается конструктор а не класс.
						    //метод нужно называть именем, не похожим на класс
						    //конструктор должен быть назван именем класса

		Employee employee1 = new Employee("Tima", "developer", 100);

		System.out.println(employee);
		System.out.println(employee1);
		
	}
}

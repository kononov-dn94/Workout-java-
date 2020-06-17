import java.util.Scanner;
 
public class Watermelon {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int kg = n.nextInt();

		if((kg > 2) && (kg%2 == 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

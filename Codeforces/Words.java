import java.util.*;

public class Words {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0) {
			String s = sc.next();
			int n = s.length();

			if(s.length() > 10) {
				System.out.println(s.charAt(0)+ "" +(n-2)+ "" + s.charAt(n-1));
			
			} else {
				System.out.println(s);
			}
		}
	}
}

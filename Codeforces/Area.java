import java.util.Scanner;
import java.lang.*;


public class Area {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long m=sc.nextInt();
		long a=sc.nextInt();
		System.out.println(((n+a-1)/a)*((m+a-1)/a));
	}
}

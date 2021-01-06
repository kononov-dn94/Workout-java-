public class Solution {
	public static void main(String[] args) {
		System.out.println(convertCelsiusToFahrenheit(41));
	}
	
	public static double canverCelsiusToFahrenheit(int celsius) {
		double fahrenheit = 9/5.0 * celsius +32;
		return fahrenheit;
	}
}

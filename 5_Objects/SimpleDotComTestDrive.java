public class SimpleDotComTestDrive {
	public static void main (String[] arg) {
		SinpleDotCom dot = new SimpleDotCom();

		int[] location = {2, 3, 4};
		dot.setLocationCells(locations);

		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "Неудача";

		if(result.equals("Попал")) {
			testResult = "Пройден";
		}
		System.out.println(testResult);
	}
}

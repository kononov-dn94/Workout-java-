public String checkYourself(String atringGuess) {
	int guess = Integer.parseInt(stringGuess);
	String result = "Мимо";

	for(int cell : localionCells) { //повторять для каждого элемента в массиве locationCells :(":" означает "в") взять следующий элемент массива и присвоить его целочисленной переменной cell 
					//int cell  - пемеменная, которая хранит один элемент массива. При каждой итерации она получает следующий элемент массива, пока все элементы не закончаться
					//locationCells - массив. Перебор эллементов которого происходит в цикле. При каждой новой итерации следующий элемент массива присваивается переменной cell

		if(guess == cell) {
			result = "Попал";
			numOfHits++;
			break;
		}		
	}
	
	if(numOfHits == locationCells.length) {
		result = "Потопил";
	}
	
	System.out.println(result);
	return result;
}

public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		String usetGuess = "2";
		String result = dot.checkYourself(userGuess);
	}
}

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "Мимо";
		
		for(int cell : locationCells) {
			if (guess == cell) {
				result = "Попал";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCell.length) {
			result = "Потопил";
		}
		
		System.out.println(result);
		return result;
	}
	
}


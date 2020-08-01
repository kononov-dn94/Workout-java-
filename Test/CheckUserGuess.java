private void checkUserGuess(String userGuess) {
	numOfGuesses++;
	String result = "Мимо";
	for(DotCom dotComToTest : dotComsList) {
		result = dotComToTest.checkYourself(userGues);
		if(result.equals("Попал")) {
			break;
		}
		if(result.equals("Потопил")) {
			dotComsList.remove(dotComToTest);
			break;
		}
	}
	System.out.println(result);
}

private void finishGame() {
	System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят."); //
	if(numOfGuesses <= 18) {
		System.out.println("Это заняло у вас всего" + numOfGuesses + "попытокю");
		System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
	} else {
		System.out.println("Это заняло у вас довольно много времени." + numOfSuesses + "Попыток.");
		System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
	}
}

public static void main(String[] args) {
	DotComBust game = new DotComBust();
	game.setUpGame();
	game.startPlaying();
}

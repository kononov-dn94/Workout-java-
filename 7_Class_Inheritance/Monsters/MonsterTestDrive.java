public class MonsterTestDrive {
	public static void main(String[] args) {
		Monster[] ma = new Monster[3];
		mo[0] = new Vampire();
		mo[1] = new Dragon();
		mo[2] = new Monster();

		for(int x = 0; x < 3; x++) {
			ma[x].frighten(x);
		}
	}
}

class Monster {
	boolean frighten(int d) {
		System.out.println("Грррр");
		return true;
	}
}

class Vampire extend Monster {
	boolean frighten(int x) {
		System.out.println("Укусить");
		return false;
	}
}

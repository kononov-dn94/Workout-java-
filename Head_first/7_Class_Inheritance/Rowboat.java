public class Rowboat extends Boat {
	public void rowTheBoat() {
		System.out.print("Давай, Наташа");
	}
}

public class Boat {
	private int length;
	public void setLength(int len) {
		length = len;
	}

	public int getLength() {
		return length;
	}

	public void mive() {
		System.out.print("Дрейф");
	}
}

public class TestBoats {
	public static void main(String[] args) {
		Boat b1 = new Boat();
		Sailboat b2 = new Sailboat();
		Rowboat b2 = new Rowboat();
		b2.setLength(32);
		b1.move();
		b2.move();
	}
}

public class Sailboat extends Boat {
	public void move() {
		System.out.print("Поднять паруса!");
	}
}

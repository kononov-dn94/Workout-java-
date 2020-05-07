class introductory {
	public static void main(String[] arg) {
		int x;
		int y;
		x = 11;
		y = 11;

		Tickler[]obs = new Tickler[5];
			while (x < 110) {
			obs[x] = new Tickler();
			obs[x].ivar = y;
			y = y * 10;
			x = x * 10;
		}
	}
}

class result3 {
	int a;
	int b;
	
	public int getMultiplication() {
		int result;
		result = a * b;
		return result;
	}
}



class result6 {
	int a;
	int b;

	public void setResult(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void Comparison() {
		if (a > b) {
			System.out.println("переменная a больше переменной b");
		}	

		if (a < b) {
			System.out.println("переменная a меньше переменной b");
		}
		
		if (a == b) {
			System.out.println("переменная a равна переменной b");
		}
	}

}

class testResult1 {
	public static void main(String[] arg) {
		result6 result = new result6();

		result.setResult(6, 7);
		result.Comparison();
	}
}

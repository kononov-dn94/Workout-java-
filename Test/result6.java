class result6 {
	int a;
	int b;

	public int result() {
		return a + b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.b = b;
	}

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

class testResult {
	public static void main(String[] arg) {
		result6 result = new result();

		result.setA(10);
		System.out.println(result.getA());

		result.setB(4);
		System.out.println(result.getB());
	}
}

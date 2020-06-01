class result5 {
	int a;
	int b;

	public int getResult(int a, int b) {
		return a * b;
	}

	/*public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int a) {
		this.b = b;
	}*/

}

class testResult {
	public static void main(String[] arg) {
		result5 result = new result5();

		result.setA(10);
		System.out.println(result.getA());

		result.setB(4);
		System.out.println(result.getB());
	}
}


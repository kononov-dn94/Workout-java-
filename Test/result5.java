class result5 {
	int a;
	int b;

	public void setAandB(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getResult() {
		return a * b;
	}
}

class testResult {
	public static void main(String[] arg) {

		result5 result = new result5();
		result.setAandB(5, 9);
		System.out.println(result.getResult());

		
	}
}


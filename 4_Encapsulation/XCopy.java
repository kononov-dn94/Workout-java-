class XCopy {
	public static void main (String[] args) {
		int orig = 42;
		XCopy x = new XCopy();
		int y = x.go(orig); 
		System.out.println(orig + " " + y);
		}
	int go(int arg) { //Класс XCopy компилируется и запускается в первоначальном виде! Переменная orig не измениться в методе go();
		arg = arg * 2;
		return arg;
	}
}

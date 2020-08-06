class Test {
	public int val;
}


class XCopy {
	public static void main (String[] args) {
		int orig = 42, orig2 = 10;

		XCopy x = new XCopy();
		int y = x.go(orig);		 
		System.out.println(orig + " " + y);

		y = x.go(orig2);		 
		System.out.println(orig2 + " " + y);

		y = x.go(5);		 
		System.out.println(orig2 + " " + y);
		
		Test testobj = new Test();
		testobj.val = 1;

		goTest(testobj);
		goTest2(testobj);

		System.out.println(testobj.val);
		String test_str = "the";
		String out_str = goObject(test_str);
		System.out.println(test_str);
		System.out.println(out_str);
		
	}
	
	public static void goTest(Test obj) {
		obj.val = 10;
	}

	public static void goTest2(Test obj) {
		obj = new Test();
		obj.val = 10;
	}	

	public static String goObject(String str) {
		str += " end";
		return str;
	}

	int go(int arg) { //Класс XCopy компилируется и запускается в первоначальном виде! Переменная orig не измениться в методе go();
		arg = arg * 2;
		return arg;
	}
}

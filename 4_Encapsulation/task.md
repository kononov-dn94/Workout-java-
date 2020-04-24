1. XCopy.java (В случае неработоспособности кода - исправить). 

class XCopy {
	public static void main (String[] args) {
		int orig = 42;
		XCopy x = new XCopy();
		int y = x.go(orig); 
		System.out.println(orig + " " + y);
		}
	int go(int arg) {
		arg = arg * 2;
		return arg;
	}
}




2. Clock.java (В случае неработоспособности кода - исправить).

class Clock {
	String time;

	void setTime(String t) {
		time = t;
	}
	
	void getTime() {
		return time;
	}
}

class ClockTestDrive {
	public static void main (String[] args) {
		
		Clock c = new Clock();

		c.setTime("1234");
		String tod = c.getTime();
		System.out.println("время: " + tod);
	}
}

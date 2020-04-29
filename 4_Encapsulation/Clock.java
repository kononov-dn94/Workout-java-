class Clock {
	private String time;

	void setTime(String t) {
		time = t;
	}
	
	String getTime() { //Метод геттер должен содержать в своем объявлении тип возвращаемого значения
		return time;
	}
}

class ClockTestDrive {
	public static void main (String[] args) {

		
		Clock c = new Clock();

		c.setTime("1234");
		System.out.println(c.getTime());

		c.setTime("qwerty");
		System.out.println(c.getTime());

		// String tod = c.getTime();
		// System.out.println("время: " + tod);


		/*System.out.println(x);
		System.out.println(y);

	        for(int i = 0; i < args.length; i++) {
		    System.out.println(args[i]);
		}*/
 
	}
}

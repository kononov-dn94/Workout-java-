public class ConcurrentMain {
	public static void main(String[] args) {
		SimpleThread th1 = new SimpleThread();
		th1.start();
	}
}

class SimpleThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println();
			}
		}
	}
}

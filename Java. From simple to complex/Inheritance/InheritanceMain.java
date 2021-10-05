public class InheritanceMain {
	public static void main(String[] args) {

		Engine truckEngine = new Engine(6, DIESEL, 900);
		Engine busEngine = new Engine(3.5, DIESEL, 150);
		Auto truck = new Truc("Volvo", "VNL 300", truskEngine, 300, 500, 1000);
		Auto bus = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
		Auto car = new ElectricCar("Tesla", "Model S", 4, 100500);
		
		runCar(bus);
		runCar(truck);
		runCar(car);
		
	}
	
	private static void runCar(Auto auto) {
		auto.start();
		auto.stop();
		auto.energize();
	}
}

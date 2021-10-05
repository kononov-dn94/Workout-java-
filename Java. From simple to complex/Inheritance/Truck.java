public class Truck extends FuelAuto {

	private int cargoWeight;
	
	public Truck(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int cargoWeinght) {
		super(producer, model, engineType, availablePetrol, tankVolume); //super - ссылка на родильский конструктор
		this.cargoWeight = cargoWeight;
		System.out.println("Constructing trusk");
	}
	

	public int getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	public void load() {
		System.out.println("Cargo loaded");
	}

	public void unload() {
		System.out.println("Cargo unloaded");
	}
	
	@Override
	public void start() {
		isRunning = true;
		setCurrentSpeed(10);
		System.out.println("Truck is starting");
	}
	
	@Override
	public void stop() {
		isRunning = false;
		setCurrentSpeed(0);
		System.out.println("Truck is stopped");
	}
	
	
	
	@Override
	public void energize() {
		fuelUP(getTankVolume() - getAvailablePotrol());
	}
}

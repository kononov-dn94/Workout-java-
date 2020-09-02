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
}

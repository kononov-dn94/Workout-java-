public class FuelAuto extends Auto {

	private int avaliblePetrol;
	private int tankVolume;

	public FuelAuto(String produser, String model, EngineType engineType, int availablePetrol, int tankVolume) {
		super(produser, model, engineType);
		this.availablePetrol = availablePetrol;
		this.tankVolume = tankVolume;
	}

	public void fuelUp(int petrolVolume) {
		availablePetrol += petrolVolume;
		System.out.println("Adding fuel");
	}

	public int getAvaliblePetrol() {
		return avaliblePetrol;
	}

	public void setAvaliblePetrol() {
		this.avaliblePetrol = avaliblePetrol;
	}
	
	public int getTankVolume() {
		return tankVolume;
	}

	public void setTankVolume() {
		this.tankVolume = tankVolume;
	}
}

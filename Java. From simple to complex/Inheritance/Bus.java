public class Bus extends FuelAuto {

	private int passengerNumber;	
	
	public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolumeint, int passengerNumber) {
		super(producer, model, engineType, availablePetrol, tankVolumeint);
		this.passengerNumber = passengerNumber;
		System.out.println("Bus was initialized");
	}

	public void fuelUp() {
		int volume = getTankVolume() - getAvailablePetrol();
		fuelUp(volume);
	}

	@Override //(переопределение)
	public void fuelUp(int petrolVolume) {
		int volume = getAvailablePetrol()+petrolVolume;

		if(volume > getTankVolume()) {
			setAvailblePetrol(getTankVolume());
		}
	}

	public int getPassengerNumber() {
		return passengerNumber;
	} 

	public void setPassengerNumber() {
		this.passengerNumber = passengerNumber;
	}

	public void pickUpPassengers(int passengerNum) {
		this.passengerNumber+=passengerNum;
		System.out.println("Picking up "+passengerNum+"passengers");
	}

	public void releasePassengers() {
		if(isRunning) {
			stop();
		}
		
		paseengerNumber = 0;
		System.out.println("Passengers released");
	}

}

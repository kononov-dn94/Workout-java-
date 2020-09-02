public class Bus extends Auto {
	public Bus(String producer, String model, EngineType engineType) {
		super(producer, model, engineType);
		System.out.println("Bus was initialized");
	}

}

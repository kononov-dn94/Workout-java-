public class InheritanceMain {
	public static void main(String[] args) {
		Bus auto = new Bus("Mercedes", "Sprinter", EngineType.DIESEL);
		System.out.println(auto.getProducer());
		System.out.println(auto.getModel());
	}
}

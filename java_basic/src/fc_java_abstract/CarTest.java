package fc_java_abstract;

public class CarTest {
	public static void main(String[] args) {
		Car aiCar = new AICar();
		Car sonata = new Sonata();
		
		aiCar.run();
		System.out.println("=================");
		sonata.run();
	}
}

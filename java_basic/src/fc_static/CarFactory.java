package fc_static;

public class CarFactory {
	//싱글톤패턴: 외부의 인스턴스 단일화
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car newCar = new Car();
		return newCar; //Car 인스턴스 참조값을 반환
	}
}

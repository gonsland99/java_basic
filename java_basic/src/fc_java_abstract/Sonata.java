package fc_java_abstract;

public class Sonata extends Car{

	@Override
	void drive() {
		System.out.println("수동운전을 합니다.");
	}
	@Override
	void stop() {
		System.out.println("직접주차를 합니다.");
	}
}

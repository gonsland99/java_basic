package fc_java_abstract;

public class AICar extends Car{

	@Override
	void setting() {	//정의된 메서드를 재정의
		System.out.println("AI시스템 시작");
	}
	@Override
	void drive() {	//추상화된 메서드를 정의
		System.out.println("자율주행을 합니다.");
	}
	@Override
	void stop() {
		System.out.println("자동주차를 합니다.");
	}
	void wash() {	//생략가능한 메서드 재정의
		System.out.println("자동세차");
	}
	
}

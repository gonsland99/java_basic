package fc_java_abstract;

public abstract class Car {	//추상화된 클래스는 인스턴스생성 불가
	//탬플릿메서드: 정해진 순서의 메뉴얼대로 진행되는 메서드
	final public void run() {
		turnOn();
		setting();
		drive();
		stop();
		turnOff();
		wash();
	}

	abstract void drive();	//추상화된 메서드(하위클래스에서 재정의 필요)
	abstract void stop();
	void wash() {};	//생략 및 재정의 가능한 메서드
	
	void setting() {
		System.out.println("안전벨트를 착용합니다.");
	}
	void turnOn() {
		System.out.println("시동을 켭니다.");
	}
	void turnOff() {
		System.out.println("시동을 끕니다.");
	}

}

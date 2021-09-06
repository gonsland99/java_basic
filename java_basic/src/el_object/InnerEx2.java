package el_object;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner();
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner();	//인스턴스멤버 직접접근 x
		InnerEx2 outer = new InnerEx2();	//외부클래스 먼저 생성 후 인스턴스맴버 접근o
		InstanceInner obj1 = outer.new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
	}
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner(); //인스턴스메서드에서는 인스턴스멤버 접근가능
		StaticInner obj2 = new StaticInner();
		//LocalInner lv = new LocalInner();	//지역멤버?에는 접근불가
	}
	void myMethod(){
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}

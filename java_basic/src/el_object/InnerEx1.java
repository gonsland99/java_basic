package el_object;

//내부 클래스의 이해
public class InnerEx1 {
	//인스턴스 내부클래스
	class InstanceInner{
		int iv = 100;
		//static int cv = 100;	//인스턴스 클래스 내 static변수 생성 불가
		final static int CONST = 100;
	}
	//static 내부클래스
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	//지역 내부클래스
	void myMethod() {
		class LocalInner{
			int iv = 300;
			//static int cv = 300;	//지역변수로서 static변수 생성 불가
			final static int CONST = 300;
		}
	}
	public static void main(String[] args) {
		//인스턴스 클래스의 인스턴스변수 접근
		InnerEx1 ie = new InnerEx1();
		InstanceInner ii = ie.new InstanceInner();
		System.out.println(ii.iv);
		//어디서든 접근 가능한 final static 변수(상수)
		System.out.println(InstanceInner.CONST);	//100
		//static 클래스 내 static변수 접근
		System.out.println(StaticInner.cv);		//200
	}
}

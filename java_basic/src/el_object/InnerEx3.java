package el_object;

class Outer{
	class InstanceInner{
		int iv = 1;
		//static int cv = 2;
	}
	static class StaticInner{
		int iv = 3;
		static int cv = 4;
	}
	void myMethod() {	//내부클래스는 외부에서 접근불가
		class LocalInner{
			int iv = 5;
			//static int cv = 6;
		}
	}
}

public class InnerEx3 {
	public static void main(String[] args) {
		//내부클래스 인스턴스변수 접근방식
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		//Outer.InstanceInner ii = new Outer.InstanceInner(); //이런식으로 접근 불가
		System.out.println(ii.iv);
		
		//static내부클래스 static변수 접근방식
		System.out.println(Outer.StaticInner.cv);
		//static내부클래스 인스턴스변수 접근방식
		Outer.StaticInner si = new Outer.StaticInner(); //이런식으로 접근 불가
		System.out.println(si.iv);
	}
}

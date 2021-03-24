package java_interface;

public class InnerClass {
	static int a = 10;	//전역변수
	int b = 20;
	int sum() {
		int n = a+b;
		return n;
	}
	//내부클래스: 외부클래스 안에 있는 클래스
	public static class inner{	//InnerClass라는 외부클래스 내부에 있는 클래스
		int minor(){
			InnerClass o = new InnerClass();
			int m = a-o.b;
			return m;
		}
	}
}

package java_interface;

public class NestedClass {
	public static void main(String[] args) {
		//외부클래스 객체생성
		InnerClass ic = new InnerClass();
		System.out.println(ic.sum());
		//내재클래스 객체생성
		//내재클래스: 외부클래스 안에 내재되어 있는 클래스
		InnerClass.inner in = new InnerClass.inner();
		System.out.println(in.minor());
	}
}

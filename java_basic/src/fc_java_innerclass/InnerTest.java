package fc_java_innerclass;

import java_interface.InnerClass;

class OutClass{
	private int num = 1;
	private static int sNum = 2;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	private class InClass{
		int iNum = 10;
		void inTest() {
			System.out.println("OutClass num = "+num+" 외부 클래스의 인스턴스 변수");
			System.out.println("OutClass sNum = "+sNum+" 외부 클래스의 스태틱 변수");
			System.out.println("InClass iNum = "+iNum+" 내부 클래스의 인스턴스 변수");
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
	//static 내부클래스는 OutClass 인스턴스생성 하지 않아도 사용가능 하므로 num변수 사용불가
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		void inTest() {
			System.out.println("OutClass sNum = "+sNum+" 외부 클래스의 스태틱 변수");
			System.out.println("SInClass num = "+iNum+" 내부 클래스의 인스턴스 변수");
			System.out.println("SInClass sNum = "+sInNum+" 내부 클래스의 스태틱 변수");
		}
		//sTest메서드는 인스턴스생성과 상관없이 사용가능 하므로 iNum은 static아니므로 생성불가
		static void inStaticTest() {
			System.out.println("OutClass sNum = "+sNum+" 외부 클래스의 스태틱 변수");
			//System.out.println("SInClass num = "+iNum+" 내부 클래스의 인스턴스 변수"); 
			System.out.println("SInClass sNum = "+sInNum+" 내부 클래스의 스태틱 변수");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingClass();
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();
		
		OutClass.InStaticClass.inStaticTest(); //static클래스,메서드는 바로 호출 가능
		//내부클래스가 private가 아니면 사용가능
//		OutClass.InClass in = outClass.new InClass();
//		in.inTest();
	}
}

package java_obb;

//객체지향
public class Person {
	//Per이라는 붕어빵틀(클래스) 생성
	public static class Per{	//전역을 위한 static
		String name;	//인스턴스변수
		int age;
		
		Per(){		//메서드
			name="Tom";
			age=10;
		}
		Per(String n, int a){	//오버로딩
			name=n;
			age=a;
		}
	}
	public static void main(String[] args) {
		Per a,b;	
		a = new Per();	//인스턴스 초기화
		b = new Per("jul", 19);
		System.out.println("이름"+a.name+" 나이"+a.age);
		System.out.println("이름"+b.name+" 나이"+b.age);
	}
}

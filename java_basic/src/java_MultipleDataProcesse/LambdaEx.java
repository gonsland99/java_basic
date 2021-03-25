package java_MultipleDataProcesse;

public class LambdaEx {
	public static void main(String[] args) {
		//익명클래스
		FunctionalInter fi;	//인터페이스를 호출
		fi = new FunctionalInter() {
			public void method() {
				System.out.println("익명클래스");
			}
		};
		fi.method();
		
		//람다식: 인터페이스(익명의 함수)를 사용하여 간단하게 표현하는 방식
		//표현방법1
		fi = () -> {System.out.println("람다식 1");};	
		fi.method();
		//표현방법2
		fi = () -> {
			String str = "람다식 2";
			System.out.println(str);
		};
		fi.method();
		//표현방법3
		fi = () -> System.out.println("람다식 3"); 
		fi.method();
	}
}


package java_MultipleDataProcesse;

public class LambdaEx {
	public static void main(String[] args) {
		//익명클래스
		FunctionalInter fi;
		fi = new FunctionalInter() {
			public void method() {
				System.out.println("익명클래스");
			}
		};
		fi.method();
		
		//람다식: 익명의 함수를 사용하여 간단하게 표현하는 방식
		//표현방법1
		fi = () -> {System.out.println("람다식 1");};	
		fi.method();
		//표현방법2
		fi = () -> {
			String str = "람다식 2";
			System.out.println(str);
		};
		fi.method();
		//표현방법1
		fi = () -> System.out.println("람다식 3"); 
		fi.method();
	}
}


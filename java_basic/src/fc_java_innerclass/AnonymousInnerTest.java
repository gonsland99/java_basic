package fc_java_innerclass;
class Outter2{
	//스택메모리에 생성 후 사라질 때 재사용가능성 있는 변수에 대해서는 상수로 잡힘
	Runnable getRunnable(int i){//매개변수는 상수로 잡힘final int i
		int num = 100;//지역변수 상소로 잡힘 final int num
		//바로 return하는 익명클래스(class이름을 사용하지 않는 경우 익명클래스화)
		return new Runnable() {
		@Override
		public void run() {
			//num = 200;   //상수로 잡히는 값들 
			//i = 10;      
			System.out.println(i); //상수로 잡혀도 원래처럼 매개,전역변수 호출은 가능
			System.out.println(num);
			}
		};
	}
	//익명클래스2
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outter2 out = new Outter2();
	
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runner.run();
	}
}

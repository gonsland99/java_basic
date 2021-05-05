package fc_java_static;

//import java.util.Calendar;

public class SingletonTest {
	public static void main(String[] args) {
		// 싱글톤 패턴: 인스턴스가 1개만 생성(동일한 인스턴스 참조)
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2); //같은 참조값을 가짐
		
		//Calendar cal = Calendar.getInstance(); //싱글톤의 대표적인 사용사례
	}
}

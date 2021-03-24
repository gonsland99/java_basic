package java_obb;

public class Equals {
	public static void main(String[] args) {
		String a = "aaa";
		String b = a;
		String c = new String("aaa");
		
		//equals는 값을 비교, ==는 참조하는 객체를 비교
		System.out.println(a.equals(b));	//true
		System.out.println(a==b);			//true
		System.out.println(a==c);			//false
		System.out.println(a.equals(c));	//true
		
	}
}

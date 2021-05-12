package fc_java_ramda;

import java.util.Arrays;
import java.util.function.BinaryOperator;
class ComparString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
}
//연산을 정의해서 쓸수 있는 reduce()
public class Reduce {
	public static void main(String[] args) {
		String greetings[] = {"안녕하세요", "Hello", "Good morning", "반가워요"};
		//람다를 이용한 연산
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> //초기값, 연산
			{if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;}
			));
		//Binaryoperator 메서드를 정의한 연산
		String str = Arrays.stream(greetings).reduce(new ComparString()).get();
		System.out.println(str);
	}
}

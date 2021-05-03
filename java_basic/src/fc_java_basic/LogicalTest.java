package fc_java_basic;

public class LogicalTest {
	public static void main(String[] args) {
		//단락회로평가 (short circuit evaluation)
		//뒤의 연산결과를 안봐도 이미 결과가 정해진 경우 뒤의 연산은 생략한다
		int num1 = 10;
		int num2 = 2;
		
		boolean res = ((num1 = num1+10) < 10) && ((num2 = num2+2) < 10); 
		//앞의 결과가 이미 false이기 때문에 뒤의 num2연산은 진행하지 않음
		
		System.out.println(num1);
		System.out.println(num2); //단락회로평가로 인해 4가 아닌 결과가 2그대로 유지
		System.out.println(res);
		
	}
}

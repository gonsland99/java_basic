package java_exception;

public class ExceptionPrint {
	public static void main(String[] args) {
		int div;
		try {
			div = 10/0;	//ArithmeticException: 0으로 나누어 발생하는 에러
			System.out.println("결과: "+div);
		}catch(Exception e) {
			System.out.println("예외정보 출력 종류");
			System.out.println("1.e: "+e);
			System.out.println("2.e.getMessage: "+e.getMessage());
			System.out.println("3.e.toString: "+e.toString());
			System.out.print("4.e.printStackTrace: ");
			e.printStackTrace();
		}
	}
}

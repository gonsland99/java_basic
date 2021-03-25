package java_exception;

public class ThrowsException {
	//발생가능 한 예외 메소드에서 직접 던지기 
	public static void calc() throws ArithmeticException{
		int div = 5/0;
	}
	
	public static void main(String[] args) {
		System.out.println("메소드에서 던지는 예외출력");
		try {
			calc();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외출력 완료");
		}
	}
}

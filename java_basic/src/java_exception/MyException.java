package java_exception;

//사용자 정의 예외처리
public class MyException {
	//MyEx에서 받아온 예외를 myMethod()로 재정의 하여 사용
	public void myMethod() throws MyEx{
		MyEx me = new MyEx("Exception: Wrong Format");
		throw me;
	}
	public static void main(String[] args) {
		MyException e = new MyException();
		try {
			e.myMethod();
		}catch(MyEx m) {
			m.printStackTrace();
		}
	}
}

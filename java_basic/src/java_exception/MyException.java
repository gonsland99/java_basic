package java_exception;

//����� ���� ����ó��
public class MyException {
	//MyEx���� �޾ƿ� ���ܸ� myMethod()�� ������ �Ͽ� ���
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

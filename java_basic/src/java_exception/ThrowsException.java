package java_exception;

public class ThrowsException {
	//�߻����� �� ���� �޼ҵ忡�� ���� ������ 
	public static void calc() throws ArithmeticException{
		int div = 5/0;
	}
	
	public static void main(String[] args) {
		System.out.println("�޼ҵ忡�� ������ �������");
		try {
			calc();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("������� �Ϸ�");
		}
	}
}

package java_exception;

public class ExceptionPrint {
	public static void main(String[] args) {
		int div;
		try {
			div = 10/0;	//ArithmeticException: 0���� ������ �߻��ϴ� ����
			System.out.println("���: "+div);
		}catch(Exception e) {
			System.out.println("�������� ��� ����");
			System.out.println("1.e: "+e);
			System.out.println("2.e.getMessage: "+e.getMessage());
			System.out.println("3.e.toString: "+e.toString());
			System.out.print("4.e.printStackTrace: ");
			e.printStackTrace();
		}
	}
}

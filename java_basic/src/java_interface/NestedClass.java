package java_interface;

public class NestedClass {
	public static void main(String[] args) {
		//�ܺ�Ŭ���� ��ü����
		InnerClass ic = new InnerClass();
		System.out.println(ic.sum());
		//����Ŭ���� ��ü����
		//����Ŭ����: �ܺ�Ŭ���� �ȿ� ����Ǿ� �ִ� Ŭ����
		InnerClass.inner in = new InnerClass.inner();
		System.out.println(in.minor());
	}
}

package java_interface;

public class InnerClass {
	static int a = 10;	//��������
	int b = 20;
	int sum() {
		int n = a+b;
		return n;
	}
	//����Ŭ����: �ܺ�Ŭ���� �ȿ� �ִ� Ŭ����
	public static class inner{	//InnerClass��� �ܺ�Ŭ���� ���ο� �ִ� Ŭ����
		int minor(){
			InnerClass o = new InnerClass();
			int m = a-o.b;
			return m;
		}
	}
}

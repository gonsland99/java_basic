package java_MultipleDataProcesse;

public class LambdaEx {
	public static void main(String[] args) {
		//�͸�Ŭ����
		FunctionalInter fi;
		fi = new FunctionalInter() {
			public void method() {
				System.out.println("�͸�Ŭ����");
			}
		};
		fi.method();
		
		//���ٽ�: �͸��� �Լ��� ����Ͽ� �����ϰ� ǥ���ϴ� ���
		//ǥ�����1
		fi = () -> {System.out.println("���ٽ� 1");};	
		fi.method();
		//ǥ�����2
		fi = () -> {
			String str = "���ٽ� 2";
			System.out.println(str);
		};
		fi.method();
		//ǥ�����1
		fi = () -> System.out.println("���ٽ� 3"); 
		fi.method();
	}
}


package java_obb;

//��ü����
public class Person {
	//Per�̶�� �ؾƲ(Ŭ����) ����
	public static class Per{	//������ ���� static
		String name;	//�ν��Ͻ�����
		int age;
		
		Per(){		//�޼���
			name="Tom";
			age=10;
		}
		Per(String n, int a){	//�����ε�
			name=n;
			age=a;
		}
	}
	public static void main(String[] args) {
		Per a,b;	
		a = new Per();	//�ν��Ͻ� �ʱ�ȭ
		b = new Per("jul", 19);
		System.out.println("�̸�"+a.name+" ����"+a.age);
		System.out.println("�̸�"+b.name+" ����"+b.age);
	}
}

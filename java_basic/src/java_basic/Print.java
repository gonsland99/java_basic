package java_basic;

public class Print {
	public static void main(String[] args) {
//printf ����
		System.out.printf("%d\n",10);		//10����
		System.out.printf("%h\n",10);		//16
		System.out.printf("%o\n",10);		//8
		System.out.printf("%f\n",10.123);	//�Ǽ�
		System.out.printf("%e\n",10.123);	//����
		System.out.printf("%c\n",'A');		//����
		System.out.printf("%s\n","���ڿ�");	//���ڿ�
		System.out.println();
//���������� �ɼ�
		System.out.printf("%1$d %1$d %1$d\n",13);	//Argument Index: ������
		System.out.printf("%3$d %1$d %2$d\n",1,2,3);	//Argument Index: ��������
		System.out.printf("%-10d: 10\n",1234);	//Flags: ��ȣ
		System.out.printf("%10d: 10\n",1234);	//Width
		System.out.printf("%6.2f\n",10.1234);	//Percision: �ּ�6�ڸ� ������ �Ҽ�2°�ڸ�
		System.out.printf("%f\n",10.1234);	//Conversion
	}
}

package java_basic;


public class Memo {
	public static void main(String[] args) {
		//�ڷ� ����ȯ
		String str = "10";
		int num = 10;
		String a = String.valueOf(num);	//���ڸ� ���ڷ� ��ȯ
		//parseInt�� �ڷ���, valueOf�� ��ü���·� �����Ѵ�.
		int b = Integer.parseInt(str);	//���ڸ� ���ڷ� ��ȯ
//		int b = Integer.valueOf(str);	//���ڸ� ���ڷ� ��ȯ2

		System.out.println(a+str);
		System.out.println(b+num);
		//��ü���·� ���ϵ� ��
//		System.out.println(Integer.parseInt("20"));
//		System.out.println(a + b);
		
/*
	// ǥ���
		����
		������,����,Ư������x
		1.�Ľ�Į ǥ���: ù���ڸ� �빮��, 2���̻� �ܾ� ���ս� ���ܾ� ù���� �빮�� ǥ���ϴ� ���	(Ŭ�����ۼ���)
		ex)MaxSpeed, Hello, ColorOfRing
		2.ī�� ǥ���: ù ���ڴ� �ҹ���, 2���̻� �ܾ� ���ս� 2��° �ܾ���� ù���� �빮�� ǥ���ϴ� ���		(����,�żҵ�)
		ex)maxSpeed, hello, colorOfRing
		3.������ũ ǥ���: ��� ���ڸ� �ҹ���, 2���̻� �ܾ� ���ս� (_)�� ����� �����ϴ� ���		(����� ��� �빮��)
		ex)max_speed, hello, color_of_ring
		4.�밡���� ǥ���: �밡�� ����� ��������� ǥ���, �����
		ex)iMS, she, sCor, iNum
	
		�����ݷ�(;): ����� �ٹٲ��� ���� ������ �ν��ϵ� ��ǻ�Ͱ� ������ ������ �ν�
		����ǻ�ʹ� ���Ϳ� ����, �������� ���鵵 �ϳ��� �������� ��� 
	//Ÿ��	
		byte	1
		short	2
		int		4byte = 32bit
		long	8
		float 	4
		double	8
		boolean	����
		char	2
	//�Ҽ���	
		�����Ҽ���:��ȣ��Ʈ,������15bit,������15bit
		�ε��Ҽ���:��ȣ��Ʈ,������8bit,������23bit
		 �������ο� e�� �Ἥ ǥ��
	//�ڵ� ���̺�	
		ASCII: keycode������ ǥ���� �̱��� �ڵ�ǥ
		UNICODE: ���������� ǥ���� ���̺�
	//������ ��� ����
	 	��ȣ > ���� > ��� > �� > �� 
*/
	}
}

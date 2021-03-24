package java_obb;

public class Parameter {
	
	/*
	�Ű�����
		������ call by value: �Ű������� �⺻Ÿ���� ���
		�������� call by reference: �Ű������� ����Ÿ���� ���
		�������� varargs: �Ű������� �̸� �������� ����.
	*/
	public static int Sum(int... num) {    // ������ �Ű����� �޼ҵ�
        int sum = 0;
        for(int n : num) {
        	sum += n;
        }
        return sum;
	}

	public static void main(String[] args) {
        System.out.println(Sum(1));
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1, 2, 3));
	}

}

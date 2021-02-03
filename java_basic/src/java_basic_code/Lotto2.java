package java_basic_code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	public static void main(String[] args) {
		/* �ζ� ������
		 	1. 6���� ������ ��(1~45) �迭�� �Է�
		 	2. �ߺ����� �ʵ��� �ۼ�
		*/
		int[] lotto = new int[6];
		Random rd = new Random();
		System.out.println("�ζ� ������");
		System.out.print("��� �����Ͻðڽ��ϱ�?: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for(int x=0; x<count; x++) {
			// �ζ� ���� ����
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = rd.nextInt(45) + 1;
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
//				System.out.print(lotto[i]+" ");
			}
//			System.out.println();
			//�������� ��� �������� ����
			for(int i=0; i<lotto.length; i++) {
				for(int j=i+1; j<lotto.length; j++) {
					if(lotto[i] > lotto[j]){
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			for(int i= 0; i<lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			} System.out.println();
		//�ζ� ���� ��
		}
	
	}
}

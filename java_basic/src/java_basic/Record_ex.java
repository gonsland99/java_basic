package java_basic;

import java.util.Scanner;

public class Record_ex {
	public static void main(String[] args) {
		//1~3�г⶧ ���� ���� ������
		int [][] recArr = new int[3][2];
		int total[] = new int[3];
		float avg[] = new float[3];
		int menu =0;
		Scanner sc = new Scanner(System.in);
				
		����:while(true) {
			System.out.println();
			System.out.println("------------1~3�г� ���� ����ǥ------------");
			System.out.println("Ȯ���� �޴��� �����ϼ���~!");
			System.out.println("(1.�Է� 2.��� 3.����)");
			System.out.println();
			menu = sc.nextInt();
			
			switch (menu) {
			//������ �Է�
			case 1: 
				for(int i=0; i<3; i++) {
					for(int j=0; j<2; j++) {
						do {
							System.out.print((i+1)+"�г� "+(j+1)+"�б� ��������: ");
							recArr[i][j] = sc.nextInt();
							if(recArr[i][j]<0 || recArr[i][j]>100) {
								System.out.println("0~100 ���� ���� �Է����ּ���");
							}
						}while(recArr[i][j]<0 || recArr[i][j]>100);
					}
				}
				System.out.println("���� �Է� �Ϸ�!");
				break;
			//���
			case 2: 
				for(int i=0; i<3; i++) {
					total[i] += recArr[i][0]+recArr[i][1];
					avg[i] = total[i]/2.0f;
					System.out.println("-----"+(i+1)+" �г� ����----------------------");
					for(int j=0; j<2; j++) {
						System.out.println((i+1)+"�г� "+(j+1)+"�б� ��������: "+recArr[i][j]);
					}
					System.out.println((i+1)+"�г� �� ����: "+total[i]);
					System.out.println((i+1)+"�г� �������: "+avg[i]);
				}
				break;
			//�ݺ��� ����
			case 3: 
				System.out.println("����Ǿ����ϴ�.");
				break ����;
			//�� �� ����� �� �ݺ�
			default:
				System.out.println("1~3���� �߿��� �޴��� �����ϼ���!");
				break ;
			}
		}
		
	}
}

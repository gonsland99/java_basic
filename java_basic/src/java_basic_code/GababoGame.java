package java_basic_code;

import java.util.Scanner;

import java_basic.Random;

public class GababoGame {
	public static void main(String[] args) {
	//com �� ����
		int menu, com;
		String userStr="";
		String comStr="";
		Random rd = new Random();
		
		com = (int)(Math.random()*3)+1;
		System.out.println(com);
	//user �� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("------����,����,�� ����-------");
		
		do {
			System.out.println("---------------------------");
			System.out.println("�Ʒ� �޴� �� ������~");
			System.out.println("----------�� ��-------------");
			System.out.println("1.���� 2.���� 3.�� 4.����");
			menu = sc.nextInt();
			
			if(menu<0 || menu>4) {
				System.out.println("1~4 �߿��� ������");
			}else if(menu == 4) {
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
		}while(menu<1 || menu>3);
	//�� ��
		userStr = menu == 1 ? "����":menu == 2 ? "����" : "��";
		comStr = com == 1 ? "����":com == 2 ? "����" : "��";
		if ((menu == 1 && com == 3) || (menu == 2 && com == 1) || (menu == 3 && com == 2)) {
			System.out.println("��! ����: " + userStr + ", ��ǻ��: " + comStr);
		} else if (menu == com) {
			System.out.println("��! ����: " + userStr + ", ��ǻ��: " + comStr);
		} else {
			System.out.println("��! ����: " + userStr + ", ��ǻ��: " + comStr);
		}
	//������
	}
}

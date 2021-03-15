package java_str;

import java.util.Scanner;

public class StructuredProgram {
	
	public static void main(String[] args) {
		int[] korList = new int[3];
		
		int menu;
		boolean keepLoop =true;
		
		while(keepLoop) {
			menu = mainMenu();
			
			switch(menu) {
			case 1:
				inputKors(korList);
				break;
			case 2:
				printKors(korList);
				break;
			case 3:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				keepLoop = false;
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1~3�� �������ּ���.");
			}
		}
	}
	static int mainMenu(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------���θ޴�-----------");
		System.out.println("1.�����Է�");
		System.out.println("2.�������");
		System.out.println("3.����");
		System.out.println("1,2,3�� �����ϼ���: ");
		int menu = sc.nextInt();
		return menu;
	}
	static void inputKors(int[] kors) {
		Scanner sc = new Scanner(System.in);
		int kor;
		
		System.out.println("-----------�����Է�-----------");
		for(int i=0; i<3; i++) {
			do {
				System.out.printf("����%d: ", i+1);
				kor = sc.nextInt();
				if(kor<0 || 100<kor)
					System.out.println("������� 0~100������ �Է°����մϴ�.");
			}while(kor<0 || 100<kor);
			kors[i] = kor;
		}
		
		return;
	}
	static void printKors(int[] kors){
		int total =0;
		float avg;
		
		for(int i=0; i<3; i++)
			total += kors[i];
		avg = total / 3.0f;
				
		System.out.println("-----------�������-----------");
		for(int i=0; i<3; i++)
			System.out.printf("����%d: %3d\n",i+1,kors[i]);
		System.out.printf("����: %3d\n",total);
		System.out.printf("���: %6.2fd\n",avg);
	}
}

package java_str;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int[] kors = new int[3];
		int total =0;
		float avg;
		int menu;
		boolean keepLoop =true;
		
		Scanner sc = new Scanner(System.in);
		
		while(keepLoop) {
			System.out.println("-----------���θ޴�-----------");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.println("1,2,3�� �����ϼ���: ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("-----------�����Է�-----------");
				for(int i=0; i<3; i++)
					do {
						System.out.printf("����%d: ", i+1);
						kors[i] = sc.nextInt();
						if(kors[i]<0 || 100<kors[i])
							System.out.println("������� 0~100������ �Է°����մϴ�.");
					}while(kors[i]<0 || 100<kors[i]);
				break;
				
			case 2:
				for(int i=0; i<3; i++)
					total += kors[i];
				avg = total / 3.0f;
						
				System.out.println("-----------�������-----------");
				for(int i=0; i<3; i++)
					System.out.printf("����%d: %3d\n",i+1,kors[i]);
				System.out.printf("����: %3d\n",total);
				System.out.printf("���: %6.2fd\n",avg);
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
}

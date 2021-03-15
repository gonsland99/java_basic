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
			System.out.println("-----------메인메뉴-----------");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			System.out.println("1,2,3중 선택하세요: ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("-----------성적입력-----------");
				for(int i=0; i<3; i++)
					do {
						System.out.printf("국어%d: ", i+1);
						kors[i] = sc.nextInt();
						if(kors[i]<0 || 100<kors[i])
							System.out.println("국어성적은 0~100까지만 입력가능합니다.");
					}while(kors[i]<0 || 100<kors[i]);
				break;
				
			case 2:
				for(int i=0; i<3; i++)
					total += kors[i];
				avg = total / 3.0f;
						
				System.out.println("-----------성적출력-----------");
				for(int i=0; i<3; i++)
					System.out.printf("국어%d: %3d\n",i+1,kors[i]);
				System.out.printf("총점: %3d\n",total);
				System.out.printf("평균: %6.2fd\n",avg);
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				keepLoop = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다. 1~3중 선택해주세요.");
			}
		}
	}
}

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
				System.out.println("프로그램이 종료되었습니다.");
				keepLoop = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다. 1~3중 선택해주세요.");
			}
		}
	}
	static int mainMenu(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------메인메뉴-----------");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.println("1,2,3중 선택하세요: ");
		int menu = sc.nextInt();
		return menu;
	}
	static void inputKors(int[] kors) {
		Scanner sc = new Scanner(System.in);
		int kor;
		
		System.out.println("-----------성적입력-----------");
		for(int i=0; i<3; i++) {
			do {
				System.out.printf("국어%d: ", i+1);
				kor = sc.nextInt();
				if(kor<0 || 100<kor)
					System.out.println("국어성적은 0~100까지만 입력가능합니다.");
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
				
		System.out.println("-----------성적출력-----------");
		for(int i=0; i<3; i++)
			System.out.printf("국어%d: %3d\n",i+1,kors[i]);
		System.out.printf("총점: %3d\n",total);
		System.out.printf("평균: %6.2fd\n",avg);
	}
}

package java_basic;

import java.util.Scanner;

public class Record_ex {
	public static void main(String[] args) {
		//1~3학년때 수학 성적 데이터
		int [][] recArr = new int[3][2];
		int total[] = new int[3];
		float avg[] = new float[3];
		int menu =0;
		Scanner sc = new Scanner(System.in);
				
		종료:while(true) {
			System.out.println();
			System.out.println("------------1~3학년 수학 성적표------------");
			System.out.println("확인할 메뉴를 선택하세요~!");
			System.out.println("(1.입력 2.결과 3.종료)");
			System.out.println();
			menu = sc.nextInt();
			
			switch (menu) {
			//데이터 입력
			case 1: 
				for(int i=0; i<3; i++) {
					for(int j=0; j<2; j++) {
						do {
							System.out.print((i+1)+"학년 "+(j+1)+"학기 수학점수: ");
							recArr[i][j] = sc.nextInt();
							if(recArr[i][j]<0 || recArr[i][j]>100) {
								System.out.println("0~100 사이 수를 입력해주세요");
							}
						}while(recArr[i][j]<0 || recArr[i][j]>100);
					}
				}
				System.out.println("점수 입력 완료!");
				break;
			//출력
			case 2: 
				for(int i=0; i<3; i++) {
					total[i] += recArr[i][0]+recArr[i][1];
					avg[i] = total[i]/2.0f;
					System.out.println("-----"+(i+1)+" 학년 성적----------------------");
					for(int j=0; j<2; j++) {
						System.out.println((i+1)+"학년 "+(j+1)+"학기 수학점수: "+recArr[i][j]);
					}
					System.out.println((i+1)+"학년 총 점수: "+total[i]);
					System.out.println((i+1)+"학년 평균점수: "+avg[i]);
				}
				break;
			//반복문 종료
			case 3: 
				System.out.println("종료되었습니다.");
				break 종료;
			//그 외 값취소 및 반복
			default:
				System.out.println("1~3까지 중에서 메뉴를 선택하세요!");
				break ;
			}
		}
		
	}
}

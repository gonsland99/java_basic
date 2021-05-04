package fc_java_basic;

import java.util.Scanner;

public class DateSearch {
	private int month, day;
	private boolean isValid;
	
	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
		}else {
			isValid = true;
			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			default:
				day = 30;
				break;
			}
		}
		this.month = month;
	}
	public void showDateInfo() {
		if(isValid) {
			System.out.println(month+"월은 "+day+"일 까지 있습니다.");
		}else {
			System.out.println("유효하지 않는 값입니다.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 확인하고 싶은 달을 입력하세요(1~12월): ");
		int month = sc.nextInt();
		
		DateSearch date = new DateSearch();
		date.setMonth(month);
		date.showDateInfo();
	}
}

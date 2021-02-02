package java_basic;


public class Memo {
	public static void main(String[] args) {
		String str = "10";
		int num = 10;
		String a = String.valueOf(num);	//숫자를 문자로 변환
		int b = Integer.parseInt(str);	//문자를 숫자로 변환
//		int b = Integer.valueOf(str);
		System.out.println(a+str);
		System.out.println(b+num);
		
		
//		System.out.println(Integer.parseInt("20"));
//		System.out.println(a + b);
/*
	최대 속도(max speed)
	1.파스칼 표기법: 첫글자를 대문자, 2개이상 단어 결합시 각단어 첫글자 대문자 표기하는 기법	(클래스작성법)
	ex)MaxSpeed, Hello, ColorOfRing
	2.카멜 표기법: 첫 글자는 소문자, 2개이상 단어 결합시 2번째 단어부터 첫글자 대문자 표기하는 기법		(변수,매소드)
	ex)maxSpeed, hello, colorOfRing
	3.스네이크 표기법: 모든 문자를 소문자, 2개이상 단어 결합시 (_)를 사용해 연결하는 기법		(상수는 모두 대문자)
	ex)max_speed, hello, color_of_ring
	4.헝가리안 표기법: 헝가리 사람이 먼저사용한 표기법, 약어사용
	ex)iMS, she, sCor, iNum

	세미콜론(;): 사람이 줄바꿈을 한줄 끝으로 인식하듯 컴퓨터가 한줄의 끝으로 인식
	ㄴ컴퓨터는 엔터와 공백, 여러개의 공백도 하나의 공백으로 취급 
*/
	}
}

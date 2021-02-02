package java_basic;

public class Print {
	public static void main(String[] args) {
//printf 형식
		System.out.printf("%d\n",10);		//10진수
		System.out.printf("%h\n",10);		//16
		System.out.printf("%o\n",10);		//8
		System.out.printf("%f\n",10.123);	//실수
		System.out.printf("%e\n",10.123);	//지수
		System.out.printf("%c\n",'A');		//문자
		System.out.printf("%s\n","문자열");	//문자열
		System.out.println();
//형식지정자 옵션
		System.out.printf("%1$d %1$d %1$d\n",13);	//Argument Index: 값지정
		System.out.printf("%3$d %1$d %2$d\n",1,2,3);	//Argument Index: 순서변경
		System.out.printf("%-10d: 10\n",1234);	//Flags: 부호
		System.out.printf("%10d: 10\n",1234);	//Width
		System.out.printf("%6.2f\n",10.1234);	//Percision: 최소6자리 공간에 소수2째자리
		System.out.printf("%f\n",10.1234);	//Conversion
	}
}

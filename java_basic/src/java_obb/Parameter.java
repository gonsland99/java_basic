package java_obb;

public class Parameter {
	
	/*
	매개변수
		값전달 call by value: 매개변수가 기본타입인 경우
		참조전달 call by reference: 매개변수가 참조타입인 경우
		가변인자 varargs: 매개변수를 미리 설정하지 않음.
	*/
	public static int Sum(int... num) {    // 가변적 매개변수 메소드
        int sum = 0;
        for(int n : num) {
        	sum += n;
        }
        return sum;
	}

	public static void main(String[] args) {
        System.out.println(Sum(1));
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1, 2, 3));
	}

}

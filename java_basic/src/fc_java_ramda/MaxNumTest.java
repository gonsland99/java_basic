package fc_java_ramda;

public class MaxNumTest {
	public static void main(String[] args) {
	/* 인터페이스 메서드 재정의
		MaxNum maxNum = new MaxNum() {
			@Override
			public int max(int x, int y) {
				return (x>y) ? x : y;
			}
		};
	*/
		
	/*람다식*/
		MaxNum maxNum = (x,y) -> x>y ? x : y;
		System.out.println(maxNum.max(5,3));
	}
}

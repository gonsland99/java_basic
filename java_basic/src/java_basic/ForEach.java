package java_basic;

public class ForEach {
	public static void main(String[] args) {
		int [] arr = {1,2,3,5,7,10};
//		for(int i=0; i<arr.length; i++) {
//			System.out.println((i+1)+".값: "+arr[i]);
//		}
		for(int num : arr) {			//foreach문 (향상된 for문)
			System.out.println("값: "+num);
		}
	}
}

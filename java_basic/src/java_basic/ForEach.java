package java_basic;

public class ForEach {
	public static void main(String[] args) {
		int [] arr = {1,2,3,5,7,10};
//		for(int i=0; i<arr.length; i++) {
//			System.out.println((i+1)+".��: "+arr[i]);
//		}
		for(int num : arr) {			//foreach�� (���� for��)
			System.out.println("��: "+num);
		}
	}
}

package java_basic;

public class ForEach {
	public static void main(String[] args) {
		//���� for��(�迭���� ���)
		int [][] arr = {{1,2},{3,5},{7,10}};
		/*		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; i++) {
				System.out.println((i+1)+".��: "+arr[i]);
			}
		}
		 */
		for(int[] a : arr) {
			for(int b : a) {
				System.out.print(b+"\t");
			}
			System.out.println();
		}
	}
}

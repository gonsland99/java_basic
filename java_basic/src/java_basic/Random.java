package java_basic;



public class Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int num = (int)(Math.random() * 6) + 1;
		//	num = rd.nextInt(6) + 1;
		
		System.out.print("������ �ֻ������� "+num+"�Դϴ�.");
		
	}

}

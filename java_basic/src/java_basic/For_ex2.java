package java_basic;

public class For_ex2 {
	public static void main(String[] args) {
		/*����� ���� ���*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		/*������� ����(���Ϲ���)*/
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		/*�¿����*/
//		for(int i=0; i<5; i++) {
//			for(int j=5; j>i+1; j--) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("@");
//			}
//			System.out.println();
//		}
		for(int i=5; i>1; i--) {
			for(int j=0; j<5; j++) {
				if(i>j) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			} System.out.println();
		}	
		/*���Ϲ���*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>j) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			} System.out.println();
		}	
		/*�Ƕ�̵���*/
		for(int i=4; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("@");
			}
			for(int j=0; j<4-i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		/*���Ϲ���*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("@");
			}
			for(int j=0; j<4-i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
	}
}

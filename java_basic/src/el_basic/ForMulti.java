package el_basic;

public class ForMulti {
	public static void main(String[] args) {
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i+" x "+j+" = "+i*j+"\t");
//			}System.out.println();
//		}
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+" x "+i+" = "+i*j+"\t");
			}System.out.println();
		}
	}
}

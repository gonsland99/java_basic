package el_basic;

public class ArrRandom {
	public static void main(String[] args) {
		//야구게임 번호 생성기 (1~6)
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		int[] result = new int[3];
		int r;
		int temp;
		
		for(int i=0; i<num.length; i++) {
			r = (int) (Math.random()*num.length);
			temp = num[i];
			num[i] = num[r];
			num[r] = temp;
		}

		for(int k=0; k<num.length; k++) {
			System.out.print(num[k]+" ");
		}System.out.println();
		
		for(int j=0; j<result.length; j++) {
			result[j] = num[j];
			System.out.print(result[j]+" ");
		}
	}
}

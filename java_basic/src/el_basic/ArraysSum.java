package el_basic;

public class ArraysSum {
	public static void main(String[] args) {
		int[][] obj ={
			{1,1,1},
			{2,2,2},
			{4,4,4},
			{5,5,5}
		};
		int sum = 0;
		int average = 0;
		int cnt = 0;
		
		for(int i=0; i<obj.length; i++) {
			for(int j=0; j<obj[i].length; j++) {
				sum += obj[i][j];
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/cnt);
	}
}

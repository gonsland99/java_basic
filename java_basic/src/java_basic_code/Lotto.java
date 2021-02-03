package java_basic_code;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		//로또 추첨기
		//1. 1~45를 입력한 배열 작성
		//2. 작성한 배열을 무작위로 섞음
		//3. 0 인덱스부터 6인덱스까지 출력
		
		int[] arr = new int[45];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		} System.out.println();						//무작위 순서
		for(int i=0; i<10_000; i++) {
			int r = (int)(Math.random() *45);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if((i+1) % 5 ==0) {
				System.out.println();
			}
		} System.out.println();
		int[] ary = Arrays.copyOf(arr, 6);		//복사
		Arrays.sort(ary);						//오름차순 정렬
		
		System.out.print("당첨 번호: ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println(", 보너스 번호: " + arr[6]);
	}
}

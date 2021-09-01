package el_basic;

import java.util.Scanner;

public class ArraysMean {
	public static void main(String[] args) {
		String[][] words = {
				{"dog", "강아지"},
				{"cat", "고양이"},
				{"bird", "새"}
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ",i+1, words[i][0]);
			
			String user = sc.nextLine();
			if(user.equals(words[i][1])) {
				System.out.println("정답!");
			} else {
				System.out.printf("땡! 정답은 %s입니다.\n\n",words[i][1]);
			}
		}
	}
}

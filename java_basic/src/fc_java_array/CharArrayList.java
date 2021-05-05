package fc_java_array;

public class CharArrayList {
	public static void main(String[] args) {
		char[] alpabet = new char[26];
		char ch = 'a';
		
		for(int i=0; i<alpabet.length; i++) {
			alpabet[i] = ch++;
		}
		for(char arr: alpabet) {
			System.out.println(arr+", "+(int)arr);
		}
	}
}

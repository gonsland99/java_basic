package fc_java_array;

public class BookTest {
	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("해리포터와 마법사의 돌", "조엔k롤링"); 
		book[1] = new Book("해리포터와 비밀의방", "조엔k롤링"); 
		book[2] = new Book("해리포터와 아즈카반의 죄수", "조엔k롤링"); 
		book[3] = new Book("해리포터와 불의잔", "조엔k롤링"); 
		book[4] = new Book("해리포터와 불사조기사단", "조엔k롤링");
		
		//book 내용 변경시 copyBook 내용도 같이 변경됨(참조하는 값이 같기 때문)
		//System.arraycopy(book, 0, copyBook, 0, 5); //arrray복사(대상, 시작점, 복사, 시작점, 종료점) 

		//book 내용 변경시 copyBook 내용 유지 방법
		//copyBook배열의 저장공간을 별도 생성
		copyBook[0] = new Book();
		copyBook[1] = new Book();
		copyBook[2] = new Book();
		copyBook[3] = new Book();
		copyBook[4] = new Book();
	
		for(int i=0; i<book.length; i++) {
			copyBook[i].setTitle(book[i].getTitle());
			copyBook[i].setAuthor(book[i].getAuthor());
		}
		
		book[0].setTitle("셜록홈즈");
		book[0].setAuthor("코난도일");
		
		System.out.println("=== book ===");
		for(Book arr: book) {
			System.out.print(arr+", ");
			arr.showBookInfo();
		}System.out.println();
		
		System.out.println("=== copyBook ===");
		for(Book arr: copyBook) {
			System.out.print(arr+", ");
			arr.showBookInfo();
		}
	}
}

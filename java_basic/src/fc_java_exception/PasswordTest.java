package fc_java_exception;

public class PasswordTest {
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws PasswordException{
		if(password == null) {
			throw new PasswordException("비밀번호를 입력하지 않았습니다.");
		}else if(password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상 필요합니다.");
		}else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = password;
	}
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String pass = null;
		try {
			test.setPassword(pass);
			System.out.println("성공1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		pass = "abc";
		try {
			test.setPassword(pass);
			System.out.println("성공2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		pass = "abcde";
		try {
			test.setPassword(pass);
			System.out.println("성공3");
		} catch (PasswordException e) {
 			System.out.println(e.getMessage());
		}
		pass = "!abcde";
		try {
			test.setPassword(pass);
			System.out.println("성공4");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}

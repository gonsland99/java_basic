package java_interface;

public class MobilePhone extends Phone implements Camera{
	
	public void takePhoto() {
		System.out.println("사진촬영");
	}
	public void viewPhoto() {
		System.out.println("사진확인");
	}
		
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone();
//		Phone p = (Phone)mp;
//		Camera c = (Camera) mp;
//		System.out.println("Phone");
//		p.call();
//		p.answer();
//		System.out.println("CameraPhone");
//		c.takePhoto();
//		c.viewPhoto();
		System.out.println("MobilePhone");
		mp.takePhoto();
		mp.viewPhoto();
		mp.call();
		mp.answer();
	}
}

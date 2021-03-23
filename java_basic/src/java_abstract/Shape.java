package java_abstract;

//추상클래스: 같은 메소드를 포함하지만 재정의 해야 될 시 
public abstract class Shape {
	protected int x,y,w,h;


	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	public void setW(int width) {
		w = width;
	}

	public void setH(int height) {
		h = height;
	}
	public abstract float getArea();
}

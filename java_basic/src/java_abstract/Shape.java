package java_abstract;

//�߻�Ŭ����: ���� �޼ҵ带 ���������� ������ �ؾ� �� �� 
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

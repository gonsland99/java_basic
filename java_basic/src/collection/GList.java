package collection;

//제네릭: 데이터 타입을 외부에서 정의하여 사용
public class GList<t> {
	private Object[] nums;
	private int current;
	
	public GList() {
		nums = new Object[3];
		current = 0;
	}
	public void add(t num) {
		nums[current] = num;
		current++;
	}
	public void clear() {
		current = 0;
	}

	public int size() {
		return current;
	}

	public t get(int index) {
		if(current < index)
			throw new IndexOutOfBoundsException();
		return (t)nums[index];
	}

}

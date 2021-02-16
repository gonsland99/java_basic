package collection;

//���׸�: ������ Ÿ���� �ܺο��� �����Ͽ� ���
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

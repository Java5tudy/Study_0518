package javastudy0518;


class Box<T> {
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}

class question2103 {
	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		T a = box1.get();  //Ÿ���� ����� ���ư�
		box1.set(box2.get());
		box2.set(a);
		return;  //void�� �ƴϸ� ��ȯ���� �־�����ϴµ� ����� �ؾ����� �𸣰ڿ� 
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println(box1.get() + "&" + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + "&" + box2.get());

	}

}

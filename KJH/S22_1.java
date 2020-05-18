package may0518;

class Box1<T> {
	private T ob;
	public void set (T o) {
		this.ob = o;
	}
	public T get() {
		return ob;
	}
}

public class S22_1 {
	public static void addBox(Box1<Integer> b1, Box1<Integer> b2, Box1<Integer> b3) {
		b1.set(b2.get() + b3.get()); //프로그래머 실수 - 수정완료
	}
	public static void main(String[] args) {
		Box1<Integer> box1 = new Box1<>();
		box1.set(24);
		Box1<Integer> box2 = new Box1<>();
		box2.set(37);
		Box1<Integer> result = new Box1<>();
		result.set(0);
		//실수 양식이 들어날 수 있도록 수정하라. - ?????
		addBox(result, box1, box2);
		System.out.println(result.get());
	}
}

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class Generic2102 {
	public static <T extends Number> void swapBox(Box<T> b11, Box<T> b22) {
		T a = b11.get();
		b11.set(b22.get());
		b22.set(a);
	}
	public static void main(String[] args) {
		Box <Integer> box1 = new Box<>();
		box1.set(99);
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println(box1.get() + "&" + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + "&" + box2.get());
	}
}

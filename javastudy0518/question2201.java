package javastudy0518;

class Box2<T> {
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}

public class question2201 {
	public static void addBox(Box2<? super Integer> b1, 
			Box2<? extends Integer> b2, Box2<? extends Integer> b3) {
		b1.set(b2.get() + b3.get());
	}

	public static void main(String[] args) {
		Box2<Integer> box1 = new Box2<>();
		box1.set(24);
		
		Box2<Integer> box2 = new Box2<>();
		box2.set(37);
		
		Box2<Integer> result = new Box2<>();
		result.set(0);
		
		addBox(result, box1, box2);
		System.out.println(result.get());
	}
}
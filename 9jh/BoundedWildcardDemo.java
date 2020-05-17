package studyJava.generic;
class Box14<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
public class BoundedWildcardDemo {
	public static <T> void addBox(
			Box14<? extends Integer> b1, Box14<? extends Integer> b2, Box14<? super Integer> b3) {
		//b3.set(b1.get()+b2.get());
		b3.set(b1.get()+b2.get());
	}
	public static void main(String[]args) {
		Box14<Integer> box1 = new Box14<>();
		box1.set(24);
		Box14<Integer> box2 = new Box14<>();
		box2.set(37);
		Box14<Integer> result = new Box14<>();
		result.set(0);
		addBox(box1, box2, result);
		System.out.println(result.get());
	}

}

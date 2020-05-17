package studyJava.generic;
class Box1<T>{
	private T ob;
	public void set(T o) {ob=o;}
	public T get() {return ob;}
}

public class BoxSwapDemo {
	public static <T extends Number> void swapBox(Box1<Integer> box1, Box1<Integer> box2) {
		Integer tmp = box2.get();
		box2.set(box1.get());
		box1.set(tmp);
	}
	
	public static void main(String[]args) {
		Box1<Integer> box1 = new Box1<>();
		box1.set(99);
		Box1<Integer> box2 = new Box1<>();
		box2.set(55);
		System.out.println(box1.get()+"&"+box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get()+"&"+box2.get());
	}
}

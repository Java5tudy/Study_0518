
class Box4<T> {
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}
public class Generic21_3 {
	private static void swapBox(Box4<Integer> box1, Box4<Integer> box2) {
		Integer a = box1.get();
		box1.set(box2.get());
		//Integer b = box2.get();로 두번 설정 할 수도 있다. box1.set(b);
		box2.set(a);
		return;
	}
	
	public static void main(String[] args) {
		Box4<Integer> box1 = new Box4<>();
		box1.set(99);
		Box4<Integer> box2 = new Box4<>();
		box2.set(55);
		
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2); //정의해야할 swapBax메서드
		System.out.println(box1.get() + " & " + box2.get());
	}


}

package may0518;

class Box<T> {
	private T ob;
	public void set(T o) {
		this.ob = o;
	}
	public T get() {
		return ob;
	}
}

public class S21_2 {
	public static void swapBox(Box<Integer> a, Box<Integer> b) {
		Integer c = a.get();
		a.set(b.get());
		b.set(c);
	} // Box<T>의 인스턴스 T는 Number또는 이를 상속하는 
	  // 하위클래스만 올 수 있도록 제한된 매개변수 선언
	  // 의미를 잘 모르겠다.
	
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());
	}
		
}

class Box5<T> {
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}

}

public class BoundedWildcardDemo22_1 {
	public static void addBox(Box5<? super Integer> b1, Box5<? extends Integer> b2, Box5<? extends Integer> b3) {
		//b1= result, b2=box1, b3=box2 이기 때문에 b1=하한제한(값을 set 설정만 가능) , b2, b3는 상한제한
		b1.set(b2.get() + b3.get());
	}
	public static void main(String[] args) {
		
		Box5<Integer> result = new Box5<>();
		result.set(0);
		
		Box5<Integer> box1 = new Box5<>();
		box1.set(24);
		
		Box5<Integer> box2 = new Box5<>();
		box2.set(37);
				
		addBox(result, box1, box2); // b1, b2, b3순서 
		System.out.println(result.get());
	}
}

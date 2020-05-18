class Box6<T> {
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}

public class BoundedWildcardGenericMethod {
	
	public static <T> boolean compBox(Box6<? extends T> box, T con) {
		T bc = box.get();
//		box.set();
		return bc.equals(con);
	}

	public static void main(String[] args) {
		Box6<Integer> box1 = new Box6<>();
		box1.set(24);
		Box6<String> box2 = new Box6<>();
		box2.set("Poly");
		
		if(compBox(box1, 25))
			System.out.println("상자 안에 25 저장");
		if(compBox(box2, "Moly"))
			System.out.println("상자 안에 Moly 저장");
		
		System.out.println(box1.get());
		System.out.println(box2.get());

	}

}

package studyJava.generic;

class Box111<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
public class BoundedWildcardGeneric {

	public static <T> boolean compBox(Box111<? extends T> box, T con) {
		T bc = box.get();
		//box.set(con);
		
		return bc.equals(con);
	}
	public static void main(String[] args) {
		Box111<Integer> box1 = new Box111<>();
		box1.set(25);
		Box111<String> box2 = new Box111<>();
		box2.set("Moly");
		
		if(compBox(box1, 25))
			System.out.println("상자 안에 25 저장");
		if(compBox(box2, "Moly"))
			System.out.println("상자 안에 Moly 저장");
		
		System.out.println(box1.get());
		System.out.println(box2.get());
	}

}

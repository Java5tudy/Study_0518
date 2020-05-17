package studyJava.generic;

class Box11<T>{
	private T ob;
	public void set (T o) {ob = o;}
	public T get() {return ob;}
}
class Toy{
	@Override
	public String toString() {return "I am a Toy";}
}
class BoxHandler {
	public static void outBox(Box11<Toy> box) {
	//public static void outBox(Box11<? extends Toy> box) > set호출 불
	//매개변수 box가 참조하는 상자에서 인스턴스를 꺼내는 기능 (get, set호출 가능)
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box11<Toy> box, Toy n) {box.set(n);}
}
public class BoundedWildcardBase {
	public static void main(String[]args) {
		Box11<Toy> box = new Box11<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}

package studyJava.generic;

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}

class Unboxer{
	public static <T> T openBox(Box<T>box) {
		return box.get();
	//인자로 전달된 상자에서 내용물을 꺼내 반환하는 메소드
	// 반환형이 T이고 전달인자의 자료형이 Box<T>인 경우 
	}
}
public class GenericMethodBoxMaker2 {
	public static void main(String[]args) {
		Box<String> box = new Box<>();
		box.set("My Generic Method");
		
		String str = Unboxer.<String>openBox(box);
		//T가 String이어야 하므로 타입 인자가 <String>으로 결정 (생략가능)
		System.out.println(str);
	}
}

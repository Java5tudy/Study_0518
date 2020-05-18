package may0518;

class Box2<T> {
	private T ob;
	public void set(T o) {
		this.ob = o;
	}
	public T get() {
		return ob;
	}
}

public class S22_2 {
	public static <T> boolean compBox(Box2<T> box, T con) { 

		T bc = box.get(); 
		if(bc.equals(con)) { // compBox의 con과 값을 비교한다.
			box.set(con);
			return true;
		}
		else {
			return false;
		}
		
		//만약 값을 바꾸라는 것이면 - > box.set(con)을 밖+맨 윗줄로 빼주면 된다.
	}
	public static void main(String[] args) {  //문제의 의도가 값을 바꾼 후에 다 출력인지
		Box2<Integer> box1 = new Box2<>();	  //아니면 값이 다르면 출력하지 말라는건지 모르겠다...
		box1.set(24);
		Box2<String> box2 = new Box2<>();
		box2.set("Poly");
		
		if(compBox(box1, 25)) {
			System.out.println("상자 안에 25 저장");
		}
		if(compBox(box2, "Moly")) {
			System.out.println("상자 안에 Moly 저장");
		}
		System.out.println(box1.get());
		System.out.println(box2.get());
	}
		
}

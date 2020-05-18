class DBox2<L, R> {
	private L left;
	private R right;
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	public String toString() {
		return left + " & " + right;
	}
}

class DDBox<U, D> {
	private U up;
	private D down;
	public void set(U u, D d) {
		up = u;
		down = d;
	}
	@Override
	public String toString() {
		return up + "\n" + down;
	}
	
}
public class Generic21_1 {
	public static void main(String[] args) {
		DBox2<String, Integer> box1 = new DBox2<>();
		box1.set("Apple", 25);
		DBox2<String, Integer> box2 = new DBox2<>();
		box2.set("Orange", 33);
		DDBox<DBox2<String, Integer>,DBox2<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);
		System.out.println(ddbox);
		

	}

}

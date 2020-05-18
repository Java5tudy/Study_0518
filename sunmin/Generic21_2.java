class DBox3<L, R> {
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

public class Generic21_2 {
	public static void main(String[] args) {
		DBox3<String, Integer> box1 = new DBox3<>();
		box1.set("Apple", 25);
		DBox3<String, Integer> box2 = new DBox3<>();
		box2.set("Orange", 33);
//		DBox3<DBox3<String, Integer>,DBox3<String, Integer>> ddbox = new DBox3<>();
//		ddbox.set(box1, box2);
		System.out.println(box1 +"\n"+box2);
		

	}

}
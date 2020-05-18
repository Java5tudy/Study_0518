package javastudy0518;

class DBox<L, R> {
	private L left;
	private R right;
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	public String toString() {
		return left + " & " + right;
	}
}

class DDBox<U, D> {
	private U uu;
	private D dd;
	public void set(U u, D d) {
		uu = u;
		dd = d;
	}
	public String toString() {
		return uu + "\n" + dd;
	}
}


public class question2101 {

	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		
		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox 
			= new DDBox<>();
		ddbox.set(box1, box2);
		
		System.out.println(ddbox);
	}

}

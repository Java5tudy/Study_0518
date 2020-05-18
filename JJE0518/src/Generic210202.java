class DBox1<L, R>{
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	@Override
	public String toString() {
		return left + " & " + right;
	}
}
public class Generic210202 {
	public static void main(String[] args) {
		DBox1<String, Integer> box1 = new DBox1<>();
		box1.set("Apple", 25);
		DBox1<String, Integer> box2 = new DBox1<>();
		box2.set("Orange", 33);
		DBox1<DBox1<String, Integer>, DBox1<String, Integer>> dbox = new DBox1<>();
		dbox.set(box1, box2);
		System.out.println(dbox);
	}

}

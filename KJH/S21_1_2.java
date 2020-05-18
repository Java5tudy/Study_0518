package may0518;
//문제의 의도를 모르겠다.
class DBox1<L, R> {
	private L left;
	private R right; 
	public void set(L o, R r) {
		this.left = o;
		this.right = r;
	}
	public String toString() {
		return left + " & " + right;
	}
}

public class S21_1_2 {
	public static void main(String[] args) {
		DBox1<String, Integer> box1 = new DBox1<>();
		box1.set("Apple", 25);
		DBox1<String, Integer> box2 = new DBox1<>();
		box2.set("Orange", 33);
		System.out.println(box1);
		System.out.println(box2);
	}
}

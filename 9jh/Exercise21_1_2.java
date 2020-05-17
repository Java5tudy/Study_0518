package studyJava.generic;

class DBox2<L, R>{
	private L left;
	private R right;
	public void set(L o, R r) {left=o;right=r;}
	public String toString() {return left+" & "+right+"\n";}
}
	
public class Exercise21_1_2 {

	public static void main(String[] args) {
		DBox2<String, Integer>box1 = new DBox2<>();
		box1.set("Apple", 25);
		DBox2<String, Integer>box2 = new DBox2<>();
		box2.set("Orange", 33);
		DBox2<DBox2<String, Integer>, DBox2<String, Integer>> box3 = 
				new DBox2<>();
		box3.set(box1, box2);
		System.out.println(box3);

	}
	
}

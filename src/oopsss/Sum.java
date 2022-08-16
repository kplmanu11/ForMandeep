package oopsss;

public class Sum {

	public float sum(int x, int y) {
		int z = x + y;
		return z;
	}

	public static void main(String[] args) {

		Sum obj = new Sum();
		//obj.sum(12,34);
		System.out.println(obj.sum(12,34));
		System.out.println("This is the added after the cloning");
	}

}

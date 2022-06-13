package access_mod_demo;

public class test1 {
	private int i = 10;
	private void show() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		test1 ti = new test1();
		ti.show();
		System.out.println(ti.i);

	}

}

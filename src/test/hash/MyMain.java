package test.hash;

public class MyMain {
	public static void main(String[] args) {

		boolean flag = new Book(1,"test_name").equals(new Book(1, "test_name"));
		System.out.println(flag);

		int a = new Book(1, "test").hashCode();
		int aa = new Book(1, "test").hashCode();

		boolean flag_ = (a == aa);

		System.out.println(a);
		System.out.println(aa);
		System.out.println(flag_);
	}

}

package javaProgrammerSE7;

// Q2
public class MyStuff {

	MyStuff(String n) {
		name = n;
	}

	String name;

	public static void main(String[] args) {

		MyStuff m1 = new MyStuff("guitar");
		MyStuff m2 = new MyStuff("tv");
		System.out.println(m2.equals(m1)); // MyStuffのequalsメソッドを呼び出しているだけ

	}

	// Object.equalsのオーバーライド
	public boolean equals(Object o) {

		MyStuff m = (MyStuff) o; // m = m1 参照
		if (m.name != null) // m1.nameはnot null("gutar") -> 同じオブジェクトのmもnot null
			return true;

		return false;

	}

}

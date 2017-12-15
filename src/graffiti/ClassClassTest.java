package graffiti;

public class ClassClassTest {
	public static void main(String[] args) {
		Class<?> cinfo1 = String.class;
		System.out.println(cinfo1.getSimpleName());
		System.out.println(cinfo1.getName());
		System.out.println(cinfo1.getPackage().getName());

		System.out.println(cinfo1.isArray()); // オブジェクト配列のクラスか?


		Class<?> cinfo2 = cinfo1.getSuperclass();
		System.out.println(cinfo2.getName());

		Class<?> cinfo3 = args.getClass();
		System.out.println(cinfo3.isArray());
	}

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QuizYourself00 {

	public static void main(String[] args) {

		Collection<String> coll = new ArrayList<>();
		coll.add("Fred"); coll.add("Jim"); coll.add("Sheila");
		System.out.println("coll is" + coll);
		coll.remove(0); // line n1
	//	coll.remove("Fred");
		System.out.println("coll is" + coll);

		List<String> test = new ArrayList<>();
		test.add("a");
		test.add("b");
		System.out.println(test);
		test.remove(0);
		System.out.println(test);

	}

}

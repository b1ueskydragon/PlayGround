package graffiti;

import java.util.ArrayList;
import java.util.List;

public class TestChild extends Test{


	public static void main(String[] args){

		List<? extends Test> list = new ArrayList<>();
		List<? super Test> list2 = new ArrayList<>();
		list2.add(new TestChild());
		list2.add(new Test());


	}

}

package sample.family;

import java.util.ArrayList;
import java.util.List;

public class Main {


	public List<? extends Test> test(){

		return new ArrayList<KoKoTest>();

	}


	public static void main(String[] args) {

//
//		List<? super KoTest> list = new ArrayList<>();
//		list.add(new KoTest());
//		list.add(new KoKoTest());


		List<Test> testList = new ArrayList<>();
		Test test = new Test();
		test.setTest("てすと");
		testList.add(test);

		/////


		List<? extends Test> list2 = testList;
		Test result = list2.get(0);


		System.out.println(result.getTest());

//		for(Test t : list2){
//			System.out.println(t.getTest());
//		}





	}

}

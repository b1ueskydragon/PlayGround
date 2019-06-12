package graffiti;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class LambdaExpression {

	public static void main(String[] args) {

		// --1-- //
		// int 省略OK
		IntBinaryOperator func = (int a, int b) -> {
			return a - b;
		};

		int a = func.applyAsInt(5, 3);
		out.println(a);


		// --2-- //

		out.println(new java.util.Date());
//		LambdaExpressionTest test = new LambdaExpressionTest();
//		test.getList().add(3333);
//		test.getList().add(333);
		out.print(getProperty("line.separator"));



		// --3-- //


		List<Integer> test = new ArrayList<>();
		test.add(333); test.add(3333);


		///(1)///
		test.forEach(out::println);


		///(2)///
		test.forEach((rlt) -> {out.println(rlt);});


		///(3)///
		for(Integer i : test){	out.println(i); }





		// --4-- //
		// アカウントの有効無効を判定 (RelayAdminUserProductのproductIdが６の要素が存在するか探索)
		// boolean accountEnable = userProductList.stream()
		// .anyMatch(userProduct -> new
		// Integer(6).equals(userProduct.getProductId()));

	}

}

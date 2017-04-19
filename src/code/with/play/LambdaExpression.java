package code.with.play;

import static java.lang.System.*;

import java.util.function.IntBinaryOperator;

public class LambdaExpression {

	public static void main(String[] args) {

		// --1--//
		IntBinaryOperator func = (int a, int b) -> {
			return a - b;
		};

		int a = func.applyAsInt(5, 3);
		out.println(a);

		// --2--//

		out.println(new java.util.Date());
		LambdaExpressionTest test = new LambdaExpressionTest();
		test.setId(18);
		test.getList().add(18);

		// --3--//
		// アカウントの有効無効を判定 (RelayAdminUserProductのproductIdが６の要素が存在するか探索)
		//boolean accountEnable = userProductList.stream()
		//		.anyMatch(userProduct -> new Integer(6).equals(userProduct.getProductId()));




	}

}

package fe.afternoon.h28h;

import static fe.afternoon.h28h.ToDo.Priority.*;
import static fe.afternoon.h28h.ToDo.State.*;

public class ToDoListTester {
	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.add(new ToDo("メール送信", "201604181500", HIGH));
		list.add(new ToDo("ホテル予約", "20160420", ToDo.Priority.LOW));
		list.add(new ToDo("チケット購入", "20160430", ToDo.Priority.MIDDLE));
		list.add(new ToDo("報告書作成", "20160428", ToDo.Priority.HIGH));
		list.add(new ToDo("会議室予約", "201605301200", ToDo.Priority.HIGH));
		list.update(new ToDo("PC購入", "20160531", ToDo.Priority.HIGH));

		for (ToDo todo : list.select()) {
			todo.setState(STARTED); // static import 使ってた
			list.update(todo);
		}

		/*
		 * 型 new Condition(){} は
		 * 継承された抽象メソッド Condition.test(ToDo) を実装する
		 */
		Condition condition1 = new Condition() {
			public boolean test(ToDo todo) {
				return todo.getDeadline().compareTo("20160501") < 0;
				/*
				 * 文字列操作 compareTo(str) 2つの文字列を辞書的に比較、strより小さかったら負、同等は0、大きかったら正。
				 */
			}
		};

		Condition condition2 = new Condition() {
			public boolean test(ToDo todo){
				return todo.getPriority().equals(ToDo.Priority.HIGH);
			}
		};

		for(ToDo todo : list.select(condition1, condition2)){
			System.out.println(todo);
		}

	}

}

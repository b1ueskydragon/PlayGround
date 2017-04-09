package fe.afternoon.h28h;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<ToDo> todoList = new ArrayList<>();

	public void add(ToDo todo) {
		if (!todoList.contains(todo)) {
			todoList.add(new ToDo(todo)); // ToDoのコンストラクター
		}
	}

	public void update(ToDo todo) {
		int index = todoList.indexOf(todo);
		/*
		 * 指定された要素がこのリスト内で最初に検出された位置のインデックスを返します。 指定された要素がこのリストにない場合は -1を返します。
		 */
		if (index != -1) {
			todoList.set(index, todo);
		}
	}

	public List<ToDo> select(Condition... conditions) {
		List<ToDo> result = new ArrayList<>();
		for (ToDo todo : todoList) {
			boolean selected = true;
			for (Condition condition : conditions) {
				selected = condition.test(todo); // Debugの結果、優先度がなぜかnull・・・・・。

				if (!selected)
					break;
			}
			if (selected) {
				result.add(new ToDo(todo));
			}
		}
		return result;
	}
}

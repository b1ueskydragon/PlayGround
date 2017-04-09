package fe.afternoon.h28h;

import java.util.UUID;

public class ToDo {
	public enum Priority {
		LOW, MIDDLE, HIGH
	}

	public enum State {
		NOT_YET_STARTED, STARTED, DONE
	}

	// 8桁または12桁の数字から成る文字列と一致する正規表現
	private static final String DEADLINE_PATTERN = "\\d{8}|\\d{12}";

	private final String id;
	private String subject;
	private String deadline;
	private Priority priority; // enum
	private State state; // enum

	private ToDo(String subject, String deadline, Priority priority, String id, State state) {
		if (!deadline.matches(DEADLINE_PATTERN)) {
			throw new IllegalArgumentException();
		}
		this.subject = subject;
		this.deadline = deadline;
		this.priority = priority; // 書き忘れてたらmainでpriorityが全nullだった・・・。
		this.id = id;
		this.state = state; // this書いたら初期化エラーなくなった〜。
	}

	public ToDo(String subject, String deadline, Priority priority) {
		this(subject, deadline, priority, UUID.randomUUID().toString(), State.NOT_YET_STARTED);
	}
	
	public ToDo(ToDo todo){
		this(todo.subject, todo.deadline, todo.priority, todo.id, todo.state);
	} 
	//書き忘れてた
	// コンストラクター？　

	public String getSubject() {
		return subject;
	}

	public String getDeadline() {
		return deadline;
	}

	public Priority getPriority() {
		return priority;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		return id.hashCode(); // hashCode ??
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof ToDo && ((ToDo) o).id.equals(id); // true又はfalse
	}

	@Override
	public String toString() {
		return String.format("主題: %s, 期限: %s, 優先度: %s, 状態: %s", subject, deadline, priority, state);
	}
}

/*
 * http://d.hatena.ne.jp/simply-k/20100816/1281985399
 * 
 * instanceof演算子の演算結果は、左辺のオブジェクトが以下の条件のどれかを満たす場合にtrueとなります。
 * 
 * 右辺に指定したクラスのオブジェクトである。 右辺に指定したクラスのサブクラスのオブジェクトである。 右辺に指定したインターフェースの実装クラスである。
 * 右辺に指定したインターフェースの実装クラスのサブクラスである。
 * instanceof演算子の演算結果がtrueになった場合、左辺のオブジェクトを右辺のクラスにキャストし、メンバにアクセスすることが可能です。
 * 
 */

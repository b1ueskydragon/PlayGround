package code.with.play;

/**
 * これ自体では未完成
 * 宣言時に型を指定する
 *
 * @param <E> 何かしらの型. extends は制限が必要な場合のみつける
 */
// after java5
public class Pocket<E extends Object> {
  private E data;

  public E getData() {
    return data;
  }

  public void setData(E data) {
    this.data = data;
  }
}

// old version
class OldPocket {
  private Object data;

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}

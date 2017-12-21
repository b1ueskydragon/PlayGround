package sample.hash;

public class ABook implements IBook {
	private Integer bookId;
	private String name;

	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ABook aBook = (ABook) o;
		if (!bookId.equals(aBook.bookId))
			return false;
		return name.equals(aBook.name);
	}

	@Override
	public int hashCode() {
		int result = bookId.hashCode();
		result = 31 * result + name.hashCode();
		return result;
	}
}

/*
 * JavaでhashCodeを実装するのはequalsを実装するときだけ 「equals()
 * を自前で実装する時だけ，hashCode()も実装する」というのがルールになっています
 * equals()をオーバライドした場合としなかった場合の動作の違いは?
 */

// (参考) https://docs.oracle.com/javase/jp/6/api/java/lang/Object.html

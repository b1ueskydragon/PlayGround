package sample.hash;

public class Book {
	private Integer bookId;
	private String name;

	public Book(Integer bookId, String name){
		this.bookId = bookId;
		this.name = name;
	}


	// 削除した場合とある場合の動作の違いは?
	@Override
	public boolean equals(Object o){
		if (this == o)
			return true;
		if(o==null || getClass() !=o.getClass())
			return false;

		Book book = (Book) o;

		if(!bookId.equals(book.bookId))
			return false;

		return name.equals(book.name);
	}

	@Override
	public int hashCode(){
		int result = bookId.hashCode();
		result = 31 * result + name.hashCode();
		return result;
	}

}

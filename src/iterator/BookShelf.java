package iterator;

import java.util.ArrayList;

public class BookShelf implements Aggegate {

	private ArrayList<Book> bookList;

	// private Book[] books;
	// private int last = 0;

	public BookShelf(int initialsize) {
		this.bookList = new ArrayList<Book>(initialsize);
	}

	public Book getBookAt(int index) {
		return (Book) bookList.get(index);

	}

	public void appendBook(Book book) {
		bookList.add(book);
	}

	public int getLength() {
		return bookList.size();
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}

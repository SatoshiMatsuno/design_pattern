package iterator;

public class Main {
	public static void main(String[] args) {

		// 任意の大きさの本棚を作成。
		BookShelf bookShelf = new BookShelf(3);

		bookShelf.appendBook(new Book("独習Java"));
		bookShelf.appendBook(new Book("サルでもわかるSQL"));
		bookShelf.appendBook(new Book("やってみよう!Ruby!!"));
		bookShelf.appendBook(new Book("新人エンジニアのためのDBマニュアル"));
		bookShelf.appendBook(new Book("test"));
		Iterator iterator = bookShelf.iterator();

		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
	}
}

package com.anon.abstractfactory;

/**
 * @author swathi on 8/20/15.
 */
public class App {
	public static void main(String[] args) {
		createBook(new NovelFactory());
		createBook(new SciFiFactory());
	}

	static void createBook(BookFactory bookFactory) {
		BookContent bookContent = bookFactory.createContent();
		BookBind bookBind = bookFactory.createBind();
		BookPrint bookPrint = bookFactory.createPrint();
		System.out.println(bookContent);
		System.out.println(bookBind);
		System.out.println(bookPrint);
	}

}

package com.anon.abstractfactory;

/**
 * @author swathi on 8/20/15.
 */
public class NovelFactory implements BookFactory {
	@Override public BookBind createBind() {
		return new NovelBind();
	}

	@Override public BookContent createContent() {
		return new NovelContent();
	}

	@Override public BookPrint createPrint() {
		return new NovelPrint();
	}
}

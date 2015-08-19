package com.anon.abstractfactory;

/**
 * @author swathi on 8/20/15.
 */
public class SciFiFactory implements BookFactory {
	@Override public BookBind createBind() {
		return new SciFiBind();
	}

	@Override public BookContent createContent() {
		return new SciFiContent();
	}

	@Override public BookPrint createPrint() {
		return new SciFiPrint();
	}
}

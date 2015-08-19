package com.anon.abstractfactory;

/**
 * @author swathi on 8/20/15.
 */
public interface BookFactory {

	BookBind createBind();

	BookContent createContent();

	BookPrint createPrint();
}
